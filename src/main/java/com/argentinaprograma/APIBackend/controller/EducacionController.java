package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionController extends JpaRepository <Educacion, Long>{
}
