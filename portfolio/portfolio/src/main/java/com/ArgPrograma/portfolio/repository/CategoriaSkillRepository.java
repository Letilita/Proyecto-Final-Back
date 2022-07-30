package com.ArgPrograma.portfolio.repository;

import com.ArgPrograma.portfolio.model.CategoriaSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaSkillRepository extends JpaRepository <CategoriaSkill, Long>{
    
}
