
package com.argentinaprograma.APIBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="acercaDe")
@Getter
@Setter
public class AcercaDe {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String datosPersonales;  
    
    

    public AcercaDe() {
    }

    public AcercaDe(Long id, String acercaDe) {
        this.id = id;
        this.datosPersonales = acercaDe;
    }
    
    
    
    
}
