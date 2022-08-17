
package com.ArgPrograma.portfolio.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    
    /*@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER, mappedBy = "catSkill")
    private Set<Skill> skills = new HashSet<>();*/

    public CategoriaSkill() {
    }

    public CategoriaSkill(Long idCatSkill, String nombreSkill) {
        this.idCatSkill = idCatSkill;
        this.nombreCatSkill = nombreSkill;
    }
    
    
    
}
