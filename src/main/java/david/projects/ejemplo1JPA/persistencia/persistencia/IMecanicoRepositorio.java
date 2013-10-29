package david.projects.ejemplo1JPA.persistencia.persistencia;

import java.util.List;

import david.projects.ejemplo1JPA.persistencia.dominio.Mecanico;
import david.projects.ejemplo1JPA.persistencia.dominio.TipoDocEnum;

public interface IMecanicoRepositorio {

	public Mecanico buscar(Long mecanicoId);

	/**
	 * Guarda un nuevo mecanico o bien actualiza datos de uno existente
	 * 
	 * @param mecanico
	 */
	public void guardar(Mecanico mecanico);

	public void eliminar(Mecanico mecanico);

	public void buscarPorDNI(TipoDocEnum tipoDoc, String numeroDoc);

	public List<Mecanico> listar();

}
