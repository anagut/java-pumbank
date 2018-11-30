package com.pumbank.persistance;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pumbank.models.Hijx;
import com.pumbank.models.Padre;


public class PadreManager {
	
	private static PadreManager instancia = null;
	private static SessionFactory sf = null;

	public static PadreManager getInstance() throws Exception {
		if (instancia == null)
			instancia = new PadreManager();

		return instancia;
	}
	
	private PadreManager() throws Exception {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public Padre getPadre(int pid) throws Exception {
		Session session = sf.openSession();

		Padre recP = session.get(Padre.class, pid);

		session.close();

		return recP;
	}
	
	public List<Hijx> dameTodosLosHijxs() throws Exception {
		List<Hijx> hijxs=null;
		
		Session session = sf.openSession();
		
		hijxs = session.createQuery("FROM Hijxs WHERE pid=?").list();
		
		session.close();
		return hijxs;
	}

}
