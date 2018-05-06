package ddt.data.importer.dao;

import javax.persistence.EntityManager;

import ddt.data.importer.JPAUtility;
import ddt.data.importer.entity.Ad;

public class AdsDAO {

	protected EntityManager em = JPAUtility.getEntityManager();

	public Ad find(int id) {
		return em.find(Ad.class, id);
	}

	public void save(Ad a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();
		
	}
}
