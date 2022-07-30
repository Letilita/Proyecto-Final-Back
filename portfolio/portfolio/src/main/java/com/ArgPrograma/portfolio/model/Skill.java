package com.ArgPrograma.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idSkill;
    @Column(nullable=false)
    private String nombreSkill;
    @Column(nullable=false)
    private int avance;
    
    @ManyToOne
    @JoinColumn(name="idCatSkill")
    private CategoriaSkill catSkill;

    public Skill() {
    }

    public Skill(Long idSkill, String nombreSkill, int avance, CategoriaSkill catSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.avance = avance;
        this.catSkill = catSkill;
    }
    
    
    
    
}
