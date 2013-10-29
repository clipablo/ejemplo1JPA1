package david.projects.ejemplo1JPA.persistencia.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String calle;
	private Integer numero;
	private String barrio;
	private String provincia;
	private String pais;

	public Direccion() {
		// TODO Auto-generated constructor stub
	}

	public Direccion(String calle, Integer numero, String barrio,
			String provincia, String pais) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.barrio = barrio;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", numero="
				+ numero + ", barrio=" + barrio + ", provincia=" + provincia
				+ ", pais=" + pais + "]";
	}

}
