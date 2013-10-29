package david.projects.ejemplo1JPA.persistencia.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Taller {
	@Id
	private Long id;
	private String nombre;
	private String observacion;
	@OneToOne(cascade = CascadeType.ALL)
	private Direccion direccion;
	@OneToMany
	private List<Box> boxes = new ArrayList<Box>();

	public Taller() {
		// TODO Auto-generated constructor stub
	}

	public Taller(String nombre, String observacion, Direccion direccion,
			List<Box> boxes) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
		this.direccion = direccion;
		this.boxes = boxes;
	}

	public Taller(String nombre, String observacion, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Box> getBoxes() {
		return boxes;
	}

	public void setBoxes(List<Box> boxes) {
		this.boxes = boxes;
	}

	// //////
	public void removeBox(Box box) {
		boxes.remove(box);
	}

	public void addBox(Box box) {
		this.boxes.add(box);
	}

	@Override
	public String toString() {
		return "Taller [id=" + id + ", nombre=" + nombre + ", observacion="
				+ observacion + ", direccion=" + direccion + "]";
	}

}
