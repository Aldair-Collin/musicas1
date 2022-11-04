
package com.java.MVCSpringTienda.web;
import com.java.MVCSpringTienda.dominio.Persona;
import com.java.MVCSpringTienda.servicios.IPersonaService;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InicioController {
    
	@Autowired
    private IPersonaService ipersonaservice;
    
    @GetMapping("/")
    public String inicio1(){
               return "inicio";
    }
	
    @GetMapping("/persona")
    public String inicio(Model model){
        List<Persona> personas= (List<Persona>) ipersonaservice.listarPersona();
        //List<Persona> personas= null;
        model.addAttribute("personas",personas );
        return "index";
    }
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        
        return "actualizar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona,Errors errors){
        if(errors.hasErrors()){
            return "actualizar";
        }
        ipersonaservice.guardarPersona(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(Persona persona, Model model){
        persona=ipersonaservice.encontrarPersona(persona);
        model.addAttribute("persona",persona);
        return "actualizar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(Persona persona){
        ipersonaservice.eliminarPersona(persona);
        return "redirect:/";
    }
    
}
