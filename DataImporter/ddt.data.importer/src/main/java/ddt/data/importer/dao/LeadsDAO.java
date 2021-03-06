package ddt.data.importer.dao;

import javax.persistence.EntityManager;

import ddt.data.importer.JPAUtility;
import ddt.data.importer.entity.Lead;

public class LeadsDAO {

	protected EntityManager em = JPAUtility.getEntityManager();

	public void save(Lead lead) {
		em.getTransaction().begin();
		em.merge(lead);
		em.getTransaction().commit();
	}
}
