
package com.ArgPrograma.portfolio.repository;

import com.ArgPrograma.portfolio.model.CategoriaSkill;
import com.ArgPrograma.portfolio.model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    List<Skill> findByCatSkill (CategoriaSkill catSkill);
    
}
