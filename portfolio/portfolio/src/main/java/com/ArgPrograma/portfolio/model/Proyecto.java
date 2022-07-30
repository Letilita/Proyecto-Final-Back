package com.ArgPrograma.portfolio.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProy;
    
    @NotNull
    private String nombreProy;
    private String descripcionProy;
    private String fechaProy;
    private String imagenProy;
    private String linkProy;

    public Proyecto() {
    }

    public Proyecto(Long idProy, String nombreProy, String descripcionProy, String fechaProy, String imagenProy, String linkProy) {
        this.idProy = idProy;
        this.nombreProy = nombreProy;
        this.descripcionProy = descripcionProy;
        this.fechaProy = fechaProy;
        this.imagenProy = imagenProy;
        this.linkProy = linkProy;
    }
    
    
}
