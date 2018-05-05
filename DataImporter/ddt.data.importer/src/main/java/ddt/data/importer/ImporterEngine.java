package ddt.data.importer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import ddt.data.importer.beans.AdStatsBean;
import ddt.data.importer.beans.LeadsBean;
import ddt.data.importer.beans.OrdersBean;

public class ImporterEngine {

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

		for(AdStatsBean a : adStats)
			System.out.println(a.getId() + " | " + a.getViews() + " | " + a.getDate().toString());
	}

	private void processLeads() throws IllegalStateException, FileNotFoundException {
		List<LeadsBean> leads = new CsvToBeanBuilder<LeadsBean>(
				new FileReader(ArgumentEngine.directory+File.separator+"leads.csv"))
				.withType(LeadsBean.class)
				.build()
				.parse();

		for(LeadsBean l : leads)
			System.out.println(l.getId() + " | " + l.getAdId() + " | " + l.getState() + " | " + l.getCreatedAt().toString() + " | " + l.getDateOfBirth());
	}

	private void processOrders() throws IllegalStateException, FileNotFoundException {
		List<OrdersBean> orders = new CsvToBeanBuilder<OrdersBean>(
				new FileReader(ArgumentEngine.directory+File.separator+"orders.csv"))
				.withType(OrdersBean.class)
				.build()
				.parse();

		for(OrdersBean o : orders)
			System.out.println(o.getId() + " | " + o.getLeadId() + " | " + o.getQuantity() + " | " + o.getShipping() + " | " + o.getUnitPrice());

	}
}