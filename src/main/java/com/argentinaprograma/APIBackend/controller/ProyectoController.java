package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoController extends JpaRepository<Proyecto, Long> {
    
}
