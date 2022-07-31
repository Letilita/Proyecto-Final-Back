
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
public class CategoriaSkill implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCatSkill;
    
    @NotNull
    private String nombreCatSkill;

    public CategoriaSkill() {
    }

    public CategoriaSkill(Long idCatSkill, String nombreSkill) {
        this.idCatSkill = idCatSkill;
        this.nombreCatSkill = nombreSkill;
    }
    
    
    
}
