package com.argentinaprograma.APIBackend.rest;

import com.argentinaprograma.APIBackend.controller.ProyectoController;
import com.argentinaprograma.APIBackend.model.Proyecto;
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
@RequestMapping("api/proyectos/")
public class ProyectoRest {

    @Autowired
    private ProyectoController proyectoController;
// VER TODOS
    @GetMapping("listar")
    public List<Proyecto> listar(){
        return proyectoController.findAll();
    } 
//GUARDAR
    @PostMapping("nueva")
    public Proyecto saveProyecto(@RequestBody Proyecto proyecto){
        return proyectoController.save(proyecto);
    }
//BUSCAR POR ID
    @GetMapping("buscar/{id}")
    public Optional<Proyecto> findById(@PathVariable("id") Long id){
        return proyectoController.findById(id);
    }
//BORRAR POR ID
    @DeleteMapping("borrar/{id}")
    public String deleteById(@PathVariable("id") Long id){
        proyectoController.deleteById(id);
        return "Se eliminó el proyecto con ID:"+" "+id+" "+"corractamente.";
    }
    
    
    
    //EDITAR 
    @PutMapping("editar/{id}")
    public String editarProyecto(@PathVariable("id") Long id,@RequestBody Proyecto proyecto) {
        Proyecto pnew=proyectoController.findById(id).orElse(null);
        //pregunto si no es nulo, entonces edito el existente
        if(pnew!=null){
            pnew.setTituloProyecto(proyecto.getTituloProyecto());
            pnew.setUrlProyecto(proyecto.getUrlProyecto());
            
            pnew.setImgProyecto(proyecto.getImgProyecto());
            pnew.setImgProyecto(proyecto.getImgProyecto());
            pnew.setDescripcionProyecto(proyecto.getDescripcionProyecto());
            proyectoController.save(pnew);
            return  "Se guardo bien y se edito";
            
        }
        
        else { //si es nulo, no existe entonces lo creo
          //  personaController.save(persona);
        return "No se encontro el id";
        
       
        }
    
    } 
    
    
    
    
    
}
