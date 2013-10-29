package david.projects.ejemplo1JPA.persistencia.dominio;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Mecanico extends Persona {
	@OneToOne
	private Box box;
	private String categoria;

	public Mecanico() {
		// TODO Auto-generated constructor stub
	}

	public Mecanico(TipoDocEnum typoDoc, String nroDoc, String nombre,
			String apellido) {
		super(typoDoc, nroDoc, nombre, apellido);
		// TODO Auto-generated constructor stub

	}

	public Mecanico(TipoDocEnum typoDoc, String nroDoc, String nombre,
			String apellido, String categoria) {
		super(typoDoc, nroDoc, nombre, apellido);
		// TODO Auto-generated constructor stub
		this.categoria = categoria;
	}
	
	public Mecanico(TipoDocEnum typoDoc, String nroDoc, String nombre,
			String apellido, String categoria, Box box) {
		super(typoDoc, nroDoc, nombre, apellido);
		// TODO Auto-generated constructor stub
		this.categoria = categoria;
		this.box = box;

	}
	
	public Box getBox() {
		return box;
	}

	public void setBox(Box box) {
		this.box = box;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Mecanico [box=" + box + ", categoria=" + categoria + "]";
	}

}
