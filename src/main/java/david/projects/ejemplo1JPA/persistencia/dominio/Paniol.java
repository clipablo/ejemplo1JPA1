package david.projects.ejemplo1JPA.persistencia.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paniol {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int numero;

	@OneToMany
	private List<Repuesto> repuestos;

	/**
	 * Constructor por defecto
	 */
	public Paniol() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor completo
	 * 
	 * @param numero
	 * @param repuestos
	 */
	public Paniol(int numero, List<Repuesto> repuestos) {
		super();
		this.numero = numero;
		this.repuestos = repuestos;
	}

	/**
	 * Construcror minimo
	 * 
	 * @param numero
	 */
	public Paniol(int numero) {
		this(numero, null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Repuesto> getRepuestos() {
		return repuestos;
	}

	public void setRepuestos(List<Repuesto> repuestos) {
		this.repuestos = repuestos;
	}

	public void addRepuesto(Repuesto repuesto) {
		this.repuestos.add(repuesto);
	}

	public void removeRepuesto(Repuesto repuesto) {
		this.repuestos.remove(repuesto);
	}

	@Override
	public String toString() {
		return "Paniol [id=" + id + ", numero=" + numero + ", repuestos="
				+ repuestos + "]";
	}

}
