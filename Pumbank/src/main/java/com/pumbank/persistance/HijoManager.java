package com.pumbank.persistance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pumbank.models.Hijx;


public class HijoManager {
	
	private static HijoManager instance = null;
	private static SessionFactory sf = null;

	public static HijoManager getInstance() throws Exception {
		if (instance == null)
			instance = new HijoManager();

		return instance;
	}
	
	private HijoManager() throws Exception {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public Hijx getHijo(int id) throws Exception {
		Session session = sf.openSession();

		Hijx recH = session.get(Hijx.class, id);

		session.close();

		return recH;
	}
}
