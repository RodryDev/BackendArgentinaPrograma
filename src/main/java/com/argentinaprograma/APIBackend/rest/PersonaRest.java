package com.argentinaprograma.APIBackend.rest;

import com.argentinaprograma.APIBackend.controller.PersonaController;
import com.argentinaprograma.APIBackend.model.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")

@RequestMapping("/api/persona/")
public class PersonaRest {

    @Autowired
    private PersonaController personaController;
    
    

    
    
    
// VER TODOS (ok)
    @GetMapping("listar")
    public List<Persona> listar(){
        return personaController.findAll();
    } 
//GUARDAR (Ok)
    @PostMapping("nueva")
    public Persona savePersona(@RequestBody Persona persona){
        return personaController.save(persona);
    }
//BUSCAR POR ID (Ok)
    @GetMapping("buscar/{id}")
    public Optional<Persona> findById(@PathVariable("id") Long id){
        return personaController.findById(id);
    }
//BORRAR POR ID
    @DeleteMapping("borrar/{id}")
    public String deleteById(@PathVariable("id") Long id){
        personaController.deleteById(id);
        return "Se eliminó la persona con ID:"+" "+id+" "+"corractamente.";
    }

//EDITAR 
    @PutMapping("editar/{id}")
    public String editarPersona(@PathVariable("id") Long id,@RequestBody Persona persona) {
        Persona pnew=personaController.findById(id).orElse(null);
        //pregunto si no es nulo, entonces edito el existente
        if(pnew!=null){
            pnew.setNombre(persona.getNombre());
            pnew.setApellido(persona.getApellido());
            pnew.setEmail(persona.getEmail());
            pnew.setUrlPersona(persona.getUrlPersona());
            pnew.setImgPersona(persona.getImgPersona());
            pnew.setCiudad(persona.getCiudad());
            pnew.setFechaNac(persona.getFechaNac());
            pnew.setQuienSoy(persona.getQuienSoy());
            personaController.save(pnew);
            return  "Se guardo bien y se edito";
            
        }
        
        else { //si es nulo, no existe entonces lo creo
          //  personaController.save(persona);
        return "No se encontro el id";
        
       
        }
    
    }   
    
}