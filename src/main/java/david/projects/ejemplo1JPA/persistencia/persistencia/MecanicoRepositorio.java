package david.projects.ejemplo1JPA.persistencia.persistencia;

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

public class MecanicoRepositorio implements IMecanicoRepositorio {

	public MecanicoRepositorio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Mecanico buscar(Long mecanicoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Mecanico mecanico) {
		System.out.println("Creando EntityManager ...");
		String UNIDAD_DE_PERSISTENCIA = "EJEMPLO1-PU";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(
				UNIDAD_DE_PERSISTENCIA, System.getProperties());
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		System.out.println("Persistiendo Mecanico...");
		em.persist(mecanico);
		em.getTransaction().commit();

		em.close();
	}

	@Override
	public void eliminar(Mecanico mecanico) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarPorDNI(TipoDocEnum tipoDoc, String numeroDoc) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Mecanico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
