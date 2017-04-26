package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="estadoRequisito")
public class requisitoCerrado extends estadoRequisito {
	static final String descripcion="cerrado";
	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		
	}
	public requisitoCerrado() {
		super(1,descripcion);
		// TODO Auto-generated constructor stub
	}


}
