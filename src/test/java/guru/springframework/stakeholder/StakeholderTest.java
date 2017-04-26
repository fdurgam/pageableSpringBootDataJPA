package guru.springframework.stakeholder;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import guru.springframework.configuration.RepositoryConfiguration;
import guru.springframework.domain.Stakeholder;
import guru.springframework.services.ServicioStakeholder;




@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class StakeholderTest {
	

	private ServicioStakeholder servicioStakeholder;
	
	@Autowired
	public void setServicioStakeholder(ServicioStakeholder servicioStakeholder) {
		this.servicioStakeholder = servicioStakeholder;
	}


	@Test
	public void test() {
		//System.out.println("Test Stakeholder");
		Integer cantidadInterasados=servicioStakeholder.obtenerTodosLosStakeholder().size();
	//	System.out.println("Cantidad Interasados: "+cantidadInterasados);
		Stakeholder empresario1= new Stakeholder(0, "20-456789-7","Juan","Pinares", "Finansista");
		servicioStakeholder.NuevoStakeholder(empresario1);
		assertTrue(servicioStakeholder.obtenerTodosLosStakeholder().size()==cantidadInterasados+1);
		
	}
	

}
