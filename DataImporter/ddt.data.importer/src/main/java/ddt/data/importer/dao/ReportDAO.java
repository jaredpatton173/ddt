package ddt.data.importer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ddt.data.importer.JPAUtility;
import ddt.data.importer.entity.AdsReport;

public class ReportDAO {

	protected EntityManager em = JPAUtility.getEntityManager();

	@SuppressWarnings("unchecked")
	public List<AdsReport> generateAllTimeReport() {
		String queryStr = "SELECT r FROM AdsReport as r";
		
		return (List<AdsReport>)em.createQuery(queryStr).getResultList();
	}
}
