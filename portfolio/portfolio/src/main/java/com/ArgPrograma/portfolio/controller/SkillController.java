
package com.ArgPrograma.portfolio.controller;

import com.ArgPrograma.portfolio.model.Skill;
import com.ArgPrograma.portfolio.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Skills")
@CrossOrigin(origins= "http://localhost:4200")
public class SkillController {
    @Autowired
    private ISkillService interSkill;
    
    @GetMapping("/todas")
    @ResponseBody
    public List<Skill> leerSkills(){
        return interSkill.traerSkills();
    }
    
    @PostMapping("/agregar")
    public String agregarSkill(@RequestBody Skill skill){
        interSkill.crearSkill(skill);
        return "Skill agregada";
    }
    
    @PutMapping("/editar")
    public void editarSkill(@RequestBody Skill skill){
        interSkill.editarSkill(skill);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public String eliminarSkill (@PathVariable Long id){
        interSkill.borrarSkill(id);
        return "Skill borrada";
    }
}
