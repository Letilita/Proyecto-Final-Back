
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
public class CategoriaEducacion implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCatEdu;
    @NotNull
    private String nombreCatEdu;

    public CategoriaEducacion() {
    }

    public CategoriaEducacion(Long idCatEdu, String nombreCatEdu) {
        this.idCatEdu = idCatEdu;
        this.nombreCatEdu = nombreCatEdu;
    }
    
    
}
