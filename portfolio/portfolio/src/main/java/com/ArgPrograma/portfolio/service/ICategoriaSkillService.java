
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.CategoriaSkill;
import java.util.List;


public interface ICategoriaSkillService {
    public List<CategoriaSkill> traerCategoriasSkills();
    public CategoriaSkill editarCategoriaSkill(CategoriaSkill cateSkill);
    public void crearCategoriaSkill(CategoriaSkill cateSkill);
    public void borrarCategoriaSkill (Long id);
}
