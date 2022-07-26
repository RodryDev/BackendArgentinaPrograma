              package com.argentinaprograma.APIBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private Integer porcentaje;
    @Column
    private String tituloHabilidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTituloHabilidad() {
        return tituloHabilidad;
    }

    public void setTituloHabilidad(String tituloHabilidad) {
        this.tituloHabilidad = tituloHabilidad;
    }
}
