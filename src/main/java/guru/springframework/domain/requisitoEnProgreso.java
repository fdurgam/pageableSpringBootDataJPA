package guru.springframework.domain;

import javax.persistence.Entity;

@Entity
public class requisitoEnProgreso extends estadoRequisito {
	static final String descripcion="En Progreso";
	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		
	}
	public requisitoEnProgreso() {
		super(1,descripcion);
		// TODO Auto-generated constructor stub
	}

}
