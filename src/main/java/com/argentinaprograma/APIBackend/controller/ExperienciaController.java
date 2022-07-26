package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaController extends JpaRepository <Experiencia, Long>{
}
