package guru.springframework.services;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import guru.springframework.domain.RequisitoSimple;
import guru.springframework.repositories.RepositorioRequisito;



@Service
@Repository
public class ServicioRequisitoSimple {
	@Autowired
	private RepositorioRequisito repositorioReqSimple ;
	@PostConstruct // La anotación PostConstruct se utiliza en un método que debe ejecutarse tras una inyección de dependencia para efectuar cualquier inicialización
	@Transactional
	public void populate(){
		System.out.println("Creando Requisitos Simples en la Base de Datos");
		RequisitoSimple req1 = new RequisitoSimple(0, "Req1","Mantener Cartera Clientes","Alta","Costo de Oportunidad", null);
		RequisitoSimple req2 = new RequisitoSimple(0, "Req2","Minimizar tiempo de respusta de atencion","Media","Fidelidad del Cliente", null);
		RequisitoSimple req3 = new RequisitoSimple(0, "Req3","Movimientos de Expedientes","Baja","Costos de Papeleo", null);
		RequisitoSimple req4 = new RequisitoSimple(0, "Req4","Provision de Medicamentos","Alta","Alta disponibilidad de entrega", null);
	repositorioReqSimple.saveAndFlush(req1);
	repositorioReqSimple.saveAndFlush(req2);
	repositorioReqSimple.saveAndFlush(req3);
	repositorioReqSimple.saveAndFlush(req4);
	
	
	}
	@Transactional
    public void delete(Long id) {

		repositorioReqSimple.delete(id);
		

    }
}
