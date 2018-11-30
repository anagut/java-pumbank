package com.pumbank.persistance;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
	
	
}
