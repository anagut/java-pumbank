package com.pumbank.persistance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pumbank.models.Paga;

public class PagaManager {

	private static PagaManager instance = null;
	private static SessionFactory sf = null;

	public static PagaManager getInstance() throws Exception {
		if (instance == null)
			instance = new PagaManager();

		return instance;
	}
	
	private PagaManager() throws Exception {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public int createPaga(Paga unaPaga) throws Exception {
//		if(unaPaga==null) return 0;
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		int pgid = ((Integer) session.save(unaPaga)).intValue();

		t.commit();
		session.close();

		return pgid;
	}
	

}
