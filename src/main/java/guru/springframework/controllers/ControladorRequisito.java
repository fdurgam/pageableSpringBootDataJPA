package guru.springframework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.domain.Proyecto;
import guru.springframework.domain.RequisitoSimple;
import guru.springframework.services.ServicioRequisitoCompuesto;
import guru.springframework.services.ServicioRequisitoSimple;


@Controller
public class ControladorRequisito {
	
	@Autowired
	private ServicioRequisitoSimple servicioRequisitoSimple;
	private ServicioRequisitoCompuesto servicioRequisitocompuesto;
	/*
	@RequestMapping("/requisitos")
	public List<Requisito> obtenerRequisitos(){
		return repositorioRequisito.findAll();
		
	}
	
	@RequestMapping("/requisitos/{id}")
	public Requisito obtenerRequisito(@PathVariable Long id){
		return repositorioRequisito.findOne(id);		
	}
	
	
	//Busqueda de Requisitos por nombre parametrizada /requisitos/?nombre=RegistroUser
	@RequestMapping(value="/requisitos/", method=RequestMethod.GET)
	public List<Requisito>  listaRequisitosdelProyecto(@RequestParam("nombre") String nombre, Model model) {
		List<Requisito> listadeRequisitos =
				repositorioRequisito.findByNombre(nombre);
				if (listadeRequisitos != null) {
				model.addAttribute("Requisitos", listadeRequisitos);
				}
				return listadeRequisitos;
		
	}
	*/
	@RequestMapping("requisitosSimple/new")
    public String newProduct(Model model){
        model.addAttribute("requisito", new RequisitoSimple());
        return "requisitoSimpleform";
        
    }
	 @RequestMapping(value = "/requisitosSimples", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("requisitos", servicioRequisitoSimple.obtenerTodosLosRequisitosSimples());
	        return "requisitossimples";
	    }
	 @RequestMapping(value = "requisitoSimple", method = RequestMethod.POST)
	    public String saveProduct(RequisitoSimple requisito){
		 servicioRequisitoSimple.NuevoRequisitoSimple(requisito);
	        return "redirect:/requisitosSimple/" + requisito.getId();
	    }
		 @RequestMapping("requisitosSimple/{id}")
		    public String showProduct(@PathVariable Long id, Model model){
		        model.addAttribute("requisito", servicioRequisitoSimple.buscarRequisitoSimplePorId(id));
		        return "requisitoSimpleshow";
		 }
		 @RequestMapping("requisitosSimple/edit/{id}")
		 public String edit(@PathVariable Long id, Model model){
			    model.addAttribute("requisito", servicioRequisitoSimple.buscarRequisitoSimplePorId(id));
			    return "requisitoSimpleform";

		 }
		 @RequestMapping("requisitosSimple/delete/{id}")
		 public String delete(@PathVariable Long id){
			 servicioRequisitoSimple.borrarRequisitoSimplePorId(id);
		     return "redirect:/requisitosSimples";
		 }
}
