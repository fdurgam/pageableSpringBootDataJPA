package guru.springframework.domain;

import javax.persistence.Entity;

@Entity
public class requisitoResuelto extends estadoRequisito {
	static final String descripcion="Resuelto";
	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		
	}
	public requisitoResuelto() {
		super(1,descripcion);
		// TODO Auto-generated constructor stub
	}

}
