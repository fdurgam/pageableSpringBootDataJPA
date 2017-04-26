package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="estadoRequisito")
public class requisitoAbierto extends estadoRequisito{
	static final String descripcion="Abierto";
	public requisitoAbierto() {
		super(1,descripcion);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		
	}


	
		
	

}
