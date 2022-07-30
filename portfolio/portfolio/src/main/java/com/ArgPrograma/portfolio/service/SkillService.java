
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.Skill;
import com.ArgPrograma.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> traerSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skill editarSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
}
