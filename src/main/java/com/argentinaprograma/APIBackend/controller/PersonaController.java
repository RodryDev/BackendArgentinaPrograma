package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;

public interface PersonaController extends JpaRepository<Persona, Long> {

//  @PutMapping("editar/persona/{id}")
//    public void editarPersona(@PathVariable Long id, @RequestBody Persona persona){
//        personaController.editarPersona(id, persona);
//    }

}
