package ddt.data.importer.dao;

import javax.persistence.EntityManager;

import ddt.data.importer.JPAUtility;
import ddt.data.importer.entity.Order;

public class OrdersDAO {
	
	protected EntityManager em = JPAUtility.getEntityManager();

	public void save(Order newOrder) {
		em.getTransaction().begin();
		em.merge(newOrder);
		em.getTransaction().commit();
		
	}

}
