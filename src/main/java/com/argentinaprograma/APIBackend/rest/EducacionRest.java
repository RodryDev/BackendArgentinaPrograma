package com.argentinaprograma.APIBackend.rest;

import com.argentinaprograma.APIBackend.controller.EducacionController;
import com.argentinaprograma.APIBackend.model.Educacion;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
@RequestMapping("api/educacion")
public class EducacionRest {

    @Autowired
    private EducacionController educacionController;
// VER TODOS
    @GetMapping("/listar")
    public List<Educacion> listar(){
        return educacionController.findAll();
    } 
//GUARDAR
    @PostMapping("/nueva")
    public Educacion saveEducacion(@RequestBody Educacion educacion){
        return educacionController.save(educacion);
    }
//BUSCAR POR ID
    @GetMapping("/buscar/{id}")
    public Optional<Educacion> findById(@PathVariable("id") Long id){
        return educacionController.findById(id);
    }
//BORRAR POR ID
    @DeleteMapping("/borrar/{id}")
    public String deleteById(@PathVariable("id") Long id){
        educacionController.deleteById(id);
        return "Se eliminó la educacion con ID:"+" "+id+" "+"corractamente.";
    }
    
    
    
//EDITAR 
    @PutMapping("editar/{id}")
    public String editarEducacion(@PathVariable("id") Long id,@RequestBody Educacion educacion) {
        Educacion pnew=educacionController.findById(id).orElse(null);
        //pregunto si no es nulo, entonces edito el existente
        if(pnew!=null){
            pnew.setTituloEducacion(educacion.getTituloEducacion());
            pnew.setImgDiploma(educacion.getUrlDiploma());
            pnew.setFechaInicio(educacion.getFechaInicio());
            pnew.setFechaFin(educacion.getFechaFin());
            pnew.setImgDiploma(educacion.getImgDiploma());
            pnew.setInstitucion(educacion.getInstitucion());
            pnew.setLocalidad(educacion.getLocalidad());
            educacionController.save(pnew);
            return  "Se guardo bien y se edito";
            
        }
        
        else { //si es nulo, no existe entonces lo creo
          //  personaController.save(persona);
        return "No se encontro el id";
        
       
        }    
    
    
    
    }
    
}
