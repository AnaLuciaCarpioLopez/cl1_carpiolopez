package main;

import javax.persistence.EntityManager;

import model.Cita;
import model.Doctore;
import model.conn;

public class main {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	EntityManager em = conn.getInstancia().getFactory().createEntityManager();
	
	/*Doctore nuevodoc = new Doctore();
	nuevodoc.setNomDoctor("CLAUDIA MEDINA");
	nuevodoc.setEspecialidadDoctor("OTORRINO");
	
	em.getTransaction().begin();
	em.persist(nuevodoc);
	em.getTransaction().commit();
	
	System.out.print("Se agrego un nuevo doctor");*/
	
	
	/*Cita nuevaCita = new Cita();
	nuevaCita.setNumCita("001");
	nuevaCita.setFechaCita("26/05/2023");
	nuevaCita.setNomPacienteCita("Juana Silva");
	
	
	em.getTransaction().begin();
	em.persist(nuevaCita);
	em.getTransaction().commit();
	
	System.out.print("Se agrego una nueva cita");*/
	
	Cita nuevaCita = new Cita();
	nuevaCita.setNumCita("003");
	nuevaCita.setFechaCita("12/06/2023");
	nuevaCita.setNomPacienteCita("Alisson Porres");
	
	
	em.getTransaction().begin();
	em.persist(nuevaCita);
	em.getTransaction().commit();
	
	System.out.print("Se agrego una nueva cita");
	
	
	
}

}
