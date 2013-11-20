package david.projects.ejemplo1JPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
   
   
import david.projects.ejemplo1JPA.persistencia.dominio.Direccion;
import david.projects.ejemplo1JPA.persistencia.dominio.Mecanico;
import david.projects.ejemplo1JPA.persistencia.dominio.Persona;
import david.projects.ejemplo1JPA.persistencia.dominio.TipoDocEnum;
import david.projects.ejemplo1JPA.persistencia.persistencia.IMecanicoRepositorio;
import david.projects.ejemplo1JPA.persistencia.persistencia.MecanicoRepositorio;

public class App {
	public static void main(String[] args) {

		System.out.println("Iniciando aplicacion ...");
		// System.out.println("Creando EntityManager ...");

		// String UNIDAD_DE_PERSISTENCIA = "EJEMPLO1-PU";
		// EntityManagerFactory factory =
		// Persistence.createEntityManagerFactory(
		// UNIDAD_DE_PERSISTENCIA, System.getProperties());
		// EntityManager em = factory.createEntityManager();

		// em.getTransaction().begin();

		// System.out.println("Creado Personas...");
		// List<Persona> personasList = new ArrayList<Persona>();
		List<Mecanico> mecanicosList = new ArrayList<Mecanico>();
		//
		// personasList
		// .add(new Persona(TipoDocEnum.DNI, "11111111", "Aaaaa", "Bbbbb"));
		// personasList
		// .add(new Persona(TipoDocEnum.DNI, "22222222", "Ccccc", "Ddddd"));
		// personasList
		// .add(new Persona(TipoDocEnum.DNI, "33333333", "Eeeee", "Fffff"));
		//
		// final Persona pAux = new Persona(TipoDocEnum.DNI, "44444444",
		// "Ggggg",
		// "Hhhhh");
		//
		// final Direccion dirAux = new Direccion("calle X", 1, "Barrio X",
		// "provincia X", "pais X");
		// em.persist(dirAux);
		//
		// pAux.setDireccion(dirAux);
		// personasList.add(pAux);

		mecanicosList.add(new Mecanico(TipoDocEnum.DNI, "55555555", "Hhhhh",
				"Iiiiii", "cat1"));
		mecanicosList.add(new Mecanico(TipoDocEnum.DNI, "66666666", "Jjjjjj",
				"Kkkkkk", "cat1"));
		mecanicosList.add(new Mecanico(TipoDocEnum.DNI, "77777777", "Llllll",
				"Mmmmmm", "cat2"));
		mecanicosList.add(new Mecanico(TipoDocEnum.DNI, "88888888", "Nnnnnn",
				"Oooooo", "cat2"));

		// System.out.println("Persistiendo Personas...");
		// for (Persona persona : personasList) {
		// em.persist(persona);
		// }

		final IMecanicoRepositorio mecanicoRepo = new MecanicoRepositorio();
		System.out.println("Persistiendo Mecanicos...");
		for (Mecanico mecanico : mecanicosList) {
			// em.persist(mecanico);
			mecanicoRepo.guardar(mecanico);
		}
		// em.flush();
		// em.getTransaction().commit();

		// ------------------------
//		System.out.println("Listando todas la personas...");
//		Query jpql1 = em.createQuery("SELECT p FROM Persona p");
//		List<Persona> personaList = jpql1.getResultList();
//		System.out.println("Tamaño lista: " + personaList.size());
//		for (Persona persona : personaList) {
//			System.out.println(persona.toString());
//		}

		// System.out.println("Listando una persona...");
		// Query jpql2 = em
		// .createQuery("SELECT p FROM Persona p WHERE p.id = :PERSONA_ID");
		// jpql2.setParameter("PERSONA_ID", 2);
		// Persona unaPersona = (Persona) jpql2.getSingleResult();
		// System.out.println(unaPersona.toString());

		// System.out.println("Listando todos los mecanicos...");
		// Query jpql2 = em.createQuery("SELECT m FROM Mecanico m");
		// List<Mecanico> mecanicoList = jpql2.getResultList();
		// System.out.println("Tamaño lista: " + mecanicoList.size());
		// for (Mecanico mecanico : mecanicoList) {
		// System.out.println(mecanico.toString());
		// }
		System.out.println("... Finalizando aplicacion");
	}
}
