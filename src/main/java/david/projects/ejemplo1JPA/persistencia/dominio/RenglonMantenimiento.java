package david.projects.ejemplo1JPA.persistencia.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RenglonMantenimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String detalle;

	@OneToOne
	private Repuesto repuesto;

	/**
	 * Constructor por defecto
	 */
	public RenglonMantenimiento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor completo
	 * 
	 * @param detalle
	 * @param repuesto
	 */
	public RenglonMantenimiento(String detalle, Repuesto repuesto) {
		super();
		this.detalle = detalle;
		this.repuesto = repuesto;
	}

	public RenglonMantenimiento(String detalle) {
		this(detalle, null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}

	@Override
	public String toString() {
		return "RenglonMantenimiento [id=" + id + ", detalle=" + detalle
				+ ", repuesto=" + repuesto + "]";
	}

}
