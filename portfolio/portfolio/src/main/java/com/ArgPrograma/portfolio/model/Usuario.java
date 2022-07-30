package com.ArgPrograma.portfolio.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.List;
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
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable=false, updatable = false)
    private Long id;
    @NotNull
    private String nombre;
    private String profesion;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private String backgroundImage;
    private String linkIn;
    private String linkWP;
    private String linkGH;
    private String linkIG;
    private String imagenPersonal;
    
    @Column(length=2000)
    private String descripcion;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idEdu")
    private List<Educacion> educacionesList;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idExp")
    private List<ExperienciaLaboral> experienciasList;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idSkill")
    private List<Skill> skillsList;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idProy")
    private List<Proyecto> proyectosList;
    
    

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String profesion, String email, String password, String backgroundImage, String linkIn, String linkWP, String linkGH, String linkIG, String imagenPersonal, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.profesion = profesion;
        this.email = email;
        this.password = password;
        this.backgroundImage = backgroundImage;
        this.linkIn = linkIn;
        this.linkWP = linkWP;
        this.linkGH = linkGH;
        this.linkIG = linkIG;
        this.imagenPersonal = imagenPersonal;
        this.descripcion = descripcion;
    }

    
    
    
    
}
