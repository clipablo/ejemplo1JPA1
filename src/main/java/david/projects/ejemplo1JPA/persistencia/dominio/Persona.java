package david.projects.ejemplo1JPA.persistencia.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
// @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
// @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "ID_PERSONA", unique = true, nullable = false, precision =
	// 10)
	private long id;
	@Enumerated(EnumType.STRING)
	// @Column(nullable = false)
	private TipoDocEnum tipoDoc;
	private String nroDoc;
	private String nombre;
	private String apellido;

	@OneToOne(cascade = CascadeType.ALL)
	private Direccion direccion;

	// @Temporal(TemporalType.DATE)
	// private Date fechaNac;
	/*
	 * Contructor por defecto
	 */
	public Persona() {
	}

	public Persona(long id, TipoDocEnum typoDoc, String nroDoc, String nombre,
			String apellido) {
		super();
		this.id = id;
		this.tipoDoc = typoDoc;
		this.nroDoc = nroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(TipoDocEnum typoDoc, String nroDoc, String nombre,
			String apellido) {
		super();

		this.tipoDoc = typoDoc;
		this.nroDoc = nroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TipoDocEnum getTypoDoc() {
		return tipoDoc;
	}

	public void setTypoDoc(TipoDocEnum typoDoc) {
		this.tipoDoc = typoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoDocEnum getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(TipoDocEnum tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	// public Date getFechaNac() {
	// return fechaNac;
	// }
	//
	// public void setFechaNac(Date fechaNac) {
	// this.fechaNac = fechaNac;
	// }

	@Override
	public String toString() {
		return "Persona{" + "id=" + id + ", typoDoc=" + tipoDoc + ", nroDoc="
				+ nroDoc + ", nombre=" + nombre + ", apellido=" + apellido
				+ '}';
	}
}
