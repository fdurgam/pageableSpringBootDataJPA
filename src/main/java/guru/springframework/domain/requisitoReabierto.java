package guru.springframework.domain;

import javax.persistence.Entity;

@Entity
public class requisitoReabierto extends estadoRequisito {
	static final String descripcion="Reabierto";
	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		
	}
	public requisitoReabierto() {
		super(1,descripcion);
		// TODO Auto-generated constructor stub
	}
}
