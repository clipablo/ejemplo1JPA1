package david.projects.ejemplo1JPA.persistencia.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String dominio;// a este se le podria colocar que sea unico
	private String marca;
	private String modelo;

	private List<Mantenimiento> mantenimientos;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(String dominio, String marca, String modelo) {
		super();
		this.dominio = dominio;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Mantenimiento> getMantenimientos() {
		return mantenimientos;
	}

	public void setMantenimientos(List<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	public void addMantenimiento(Mantenimiento mantenimiento) {
		mantenimientos.add(mantenimiento);
	}

	public void removeMantenimientos(Mantenimiento mantenimiento) {
		this.mantenimientos.remove(mantenimiento);
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", dominio=" + dominio + ", marca="
				+ marca + ", modelo=" + modelo + "]";
	}

}
