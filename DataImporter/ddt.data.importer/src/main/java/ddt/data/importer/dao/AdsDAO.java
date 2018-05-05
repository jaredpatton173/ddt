package ddt.data.importer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ddt.data.importer.entity.Ad;

public class AdsDAO {
	
	@PersistenceContext
	protected EntityManager em;
	
	public void save(Ad a) {
		System.out.println("hi");
		em.persist(a);
	}
}
