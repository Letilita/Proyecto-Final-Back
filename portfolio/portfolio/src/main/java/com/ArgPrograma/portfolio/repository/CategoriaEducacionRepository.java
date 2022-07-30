
package com.ArgPrograma.portfolio.repository;

import com.ArgPrograma.portfolio.model.CategoriaEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEducacionRepository extends JpaRepository <CategoriaEducacion, Long> {
    
}
