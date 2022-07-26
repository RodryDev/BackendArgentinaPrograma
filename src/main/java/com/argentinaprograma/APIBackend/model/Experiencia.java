package com.argentinaprograma.APIBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nombreEmpresa;
    @Column
    private String urlEmpresa;
    @Column
    private String imgEmpresa;
    @Column
    private String puesto;
    @Column
    private String fechaInicio;
    @Column
    private String fechaFinal;
    @Column
    private String localidadEmpresa;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombreEmpresa, String urlEmpresa, String imgEmpresa, String puesto, String fechaInicioExperiencia, String fechaFinalExperiencia, String localidadEmpresa) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.urlEmpresa = urlEmpresa;
        this.imgEmpresa = imgEmpresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.localidadEmpresa = localidadEmpresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getUrlEmpresa() {
        return urlEmpresa;
    }

    public void setUrlEmpresa(String urlEmpresa) {
        this.urlEmpresa = urlEmpresa;
    }

    public String getImgEmpresa() {
        return imgEmpresa;
    }

    public void setImgEmpresa(String imgEmpresa) {
        this.imgEmpresa = imgEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getLocalidadEmpresa() {
        return localidadEmpresa;
    }

    public void setLocalidadEmpresa(String localidadEmpresa) {
        this.localidadEmpresa = localidadEmpresa;
    }

 

    
    
    
}
