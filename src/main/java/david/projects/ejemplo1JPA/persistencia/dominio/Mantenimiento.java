package david.projects.ejemplo1JPA.persistencia.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mantenimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String observación;

	@OneToOne
	private Vehiculo vehiculo;

	@OneToMany
	// (cascade = CascadeType.ALL)// esto dependera si el mantenimiento se
	// encarga de la peristencia de los renglones o bien, si casa renglons e
	// gursa solo y luego se le agrega al mantenimiento
	private List<RenglonMantenimiento> renglones;

	// = new ArrayList<RenglonMantenimiento>();

	/**
	 * Constructor por defecto
	 */
	public Mantenimiento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor completo
	 * 
	 * @param estado
	 * @param fecha
	 * @param observación
	 * @param vehiculo
	 * @param renglones
	 */
	public Mantenimiento(String estado, Date fecha, String observación,
			Vehiculo vehiculo, List<RenglonMantenimiento> renglones) {
		super();
		this.estado = estado;
		this.fecha = fecha;
		this.observación = observación;
		this.vehiculo = vehiculo;
		this.renglones = renglones;
	}

	public Mantenimiento(String estado, Date fecha, String observación,
			Vehiculo vehiculo) {
		this(estado, fecha, observación, vehiculo, null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getObservación() {
		return observación;
	}

	public void setObservación(String observación) {
		this.observación = observación;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<RenglonMantenimiento> getRenglones() {
		return renglones;
	}

	public void setRenglones(List<RenglonMantenimiento> renglones) {
		this.renglones = renglones;
	}

	public void addRenglon(RenglonMantenimiento renglon) {
		this.renglones.add(renglon);
	}

	public void removeRenglon(RenglonMantenimiento renglon) {
		this.renglones.remove(renglon);
	}

	@Override
	public String toString() {
		return "Mantenimiento [id=" + id + ", estado=" + estado + ", fecha="
				+ fecha + ", observación=" + observación + ", vehiculo="
				+ vehiculo.toString() + ", renglones=" + renglones + "]";
	}

}
