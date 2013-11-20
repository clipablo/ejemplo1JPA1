package david.projects.ejemplo1JPA.persistencia.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Box {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int numero;
	private String categoria;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(int numero, String categoria) {
		super();
		this.numero = numero;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}/*

	public void setNumero(int numero) {
		this.numero = numero;
	}*/

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Box [id=" + id + ", numero=" + numero + ", categoria="
				+ categoria + "]";
	}

}
