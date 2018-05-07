package ddt.data.importer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ddt.data.importer.JPAUtility;
import ddt.data.importer.entity.AdsReport;

public class ReportDAO {

	protected EntityManager em = JPAUtility.getEntityManager();

	public List<AdsReport> generateAllTimeReport() {
		String queryStr = "SELECT NEW ddt.data.importer.AdsReport(r.id, r.total_views, r.ctr_percentage"
				+ ", r.conversion_rate_percentage, r.total_revenue, r.average_customer_age, r.best_state, r.worst_state) " + 
				"FROM v_ads_report AS r";
		
		TypedQuery<AdsReport> query = em.createQuery(queryStr, AdsReport.class);
		return query.getResultList();
		
	}
}
