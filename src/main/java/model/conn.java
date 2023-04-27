package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conn {
	private static conn instancia = new conn();
	private EntityManagerFactory factory;
	
	public conn() {
		this.factory = Persistence.createEntityManagerFactory("CL1_CARPIO_LOPEZ");
	}
	
	public static conn getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}


}
