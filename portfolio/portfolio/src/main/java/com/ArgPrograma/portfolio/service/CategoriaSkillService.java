
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.CategoriaSkill;
import com.ArgPrograma.portfolio.repository.CategoriaSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaSkillService implements ICategoriaSkillService {
  @Autowired
    public CategoriaSkillRepository catSkillRepo;  

    @Override
    public List<CategoriaSkill> traerCategoriasSkills() {
        return catSkillRepo.findAll();
    }

    @Override
    public CategoriaSkill editarCategoriaSkill(CategoriaSkill cateSkill) {
        return catSkillRepo.save(cateSkill);
    }

    @Override
    public void crearCategoriaSkill(CategoriaSkill cateSkill) {
        catSkillRepo.save(cateSkill);
    }

    @Override
    public void borrarCategoriaSkill(Long id) {
        catSkillRepo.deleteById(id);
    }
}
