package com.argentinaprograma.APIBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String tituloEducacion;
    @Column
    private String urlDiploma;
    @Column
    private String imgDiploma;
    @Column
    private String institucion;
    @Column
    private String fechaInicio;
    @Column
    private String fechaFin;
    @Column
    private String localidad;

    public Educacion() {
    }

    public Educacion(Long id, String tituloEducacion, String urlDiploma, String imgDiploma, String institucion, String fechaInicio, String fechaFin, String localidad) {
        this.id = id;
        this.tituloEducacion = tituloEducacion;
        this.urlDiploma = urlDiploma;
        this.imgDiploma = imgDiploma;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.localidad = localidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloEducacion() {
        return tituloEducacion;
    }

    public void setTituloEducacion(String tituloEducacion) {
        this.tituloEducacion = tituloEducacion;
    }

    public String getUrlDiploma() {
        return urlDiploma;
    }

    public void setUrlDiploma(String urlDiploma) {
        this.urlDiploma = urlDiploma;
    }

    public String getImgDiploma() {
        return imgDiploma;
    }

    public void setImgDiploma(String imgDiploma) {
        this.imgDiploma = imgDiploma;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    
    
    
    
}
