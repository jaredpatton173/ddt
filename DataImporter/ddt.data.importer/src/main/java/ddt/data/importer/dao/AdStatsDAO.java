package ddt.data.importer.dao;

import javax.persistence.EntityManager;

import ddt.data.importer.JPAUtility;
import ddt.data.importer.entity.AdStats;

public class AdStatsDAO {

	protected EntityManager em = JPAUtility.getEntityManager();

	public void save(AdStats a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();
	}
}
