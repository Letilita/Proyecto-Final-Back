package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> traerSkills();
    public Skill editarSkill(Skill skill);
    public void crearSkill(Skill skill);
    public void borrarSkill (Long id);
}
