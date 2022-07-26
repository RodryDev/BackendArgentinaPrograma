package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadController extends JpaRepository <Habilidad, Long>{
}
