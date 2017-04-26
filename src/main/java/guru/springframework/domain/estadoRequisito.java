package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
abstract public class estadoRequisito {
	public estadoRequisito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public estadoRequisito(long id, String descripcionEstado) {
		super();
		this.id = id;
		this.descripcionEstado = descripcionEstado;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long id;
	private String descripcionEstado;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	



	public String getDescripcionEstado() {
		return descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}
	
	abstract public void resolver();


	/*abstract public void cerrar();
	
	abstract public void iniciarProgreso();
	
	abstract public void detenerProgreso();
	
	abstract public void reabrir();
	*/
	
}
