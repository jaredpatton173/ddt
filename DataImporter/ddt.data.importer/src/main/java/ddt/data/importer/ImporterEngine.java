package ddt.data.importer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import ddt.data.importer.beans.AdStatsBean;
import ddt.data.importer.beans.LeadsBean;
import ddt.data.importer.beans.OrdersBean;
import ddt.data.importer.dao.AdStatsDAO;
import ddt.data.importer.dao.AdsDAO;
import ddt.data.importer.dao.LeadsDAO;
import ddt.data.importer.dao.OrdersDAO;
import ddt.data.importer.entity.Ad;
import ddt.data.importer.entity.AdStats;
import ddt.data.importer.entity.Lead;
import ddt.data.importer.entity.Order;

public class ImporterEngine {

	private AdStatsDAO adStatsDAO = new AdStatsDAO();
	private AdsDAO adsDAO = new AdsDAO();
	private LeadsDAO leadsDAO = new LeadsDAO();
	private OrdersDAO ordersDAO = new OrdersDAO();
	
	public ImporterEngine() throws IllegalStateException, FileNotFoundException {
		processAds();
		processLeads();
		processOrders();
	}

	private void processAds() throws IllegalStateException, FileNotFoundException {
		List<AdStatsBean> adStats = new CsvToBeanBuilder<AdStatsBean>(
				new FileReader(ArgumentEngine.directory+File.separator+"ad-stats.csv"))
				.withType(AdStatsBean.class)
				.build()
				.parse();

		processAdIds(adStats);
		processAdStats(adStats);
	}

	private void processAdStats(List<AdStatsBean> ads) {
		for(AdStatsBean a : ads) {
			AdStats newAdStats = new AdStats();
			newAdStats.setId(a.getId());
			newAdStats.setDate(a.getDate());
			newAdStats.setDailyViews(a.getViews());

			adStatsDAO.save(newAdStats);
		}
	}

	private void processAdIds(List<AdStatsBean> ads) {
		for(AdStatsBean s : ads) {
			Ad a = adsDAO.find(s.getId());
			if (a == null) {
				a = new Ad();
				a.setId(s.getId());
				adsDAO.save(a);
			}
		}
	}

	private void processLeads() throws IllegalStateException, FileNotFoundException {
		List<LeadsBean> leads = new CsvToBeanBuilder<LeadsBean>(
				new FileReader(ArgumentEngine.directory+File.separator+"leads.csv"))
				.withType(LeadsBean.class)
				.build()
				.parse();

		for(LeadsBean l : leads) {
			Lead newLead = new Lead();
			newLead.setId(l.getId());
			newLead.setAd(new Ad(l.getAdId()));
			newLead.setBirthDate(l.getDateOfBirth());
			newLead.setCreatedAt(l.getCreatedAt());
			newLead.setState(l.getState());
			
			leadsDAO.save(newLead);
		}
	}

	private void processOrders() throws IllegalStateException, FileNotFoundException {
		List<OrdersBean> orders = new CsvToBeanBuilder<OrdersBean>(
				new FileReader(ArgumentEngine.directory+File.separator+"orders.csv"))
				.withType(OrdersBean.class)
				.build()
				.parse();

		for(OrdersBean o : orders) {
			Order newOrder = new Order();
			newOrder.setId(o.getId());
			newOrder.setLead(new Lead(o.getLeadId()));
			newOrder.setQuantity(o.getQuantity());
			newOrder.setShipping(o.getShipping());
			newOrder.setUnitPrice(o.getUnitPrice());
			
			ordersDAO.save(newOrder);
		}
	}
}
