
package com.ArgPrograma.portfolio.controller;

import com.ArgPrograma.portfolio.model.CategoriaSkill;
import com.ArgPrograma.portfolio.service.ICategoriaSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/CategoriasSkill")
public class CategoriaSkillController {
    @Autowired
    private ICategoriaSkillService interCatSkill;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<CategoriaSkill> leerCategoriasSkills(){
        return interCatSkill.traerCategoriasSkills();
    }
    
    @PostMapping("/agregar")
    public void agregarCategoriaSkill(@RequestBody CategoriaSkill catKill){
        interCatSkill.crearCategoriaSkill(catKill);
    }
    
    @PutMapping("/editar")
    public void editarCategoriaSkill(@RequestBody CategoriaSkill catKill){
        interCatSkill.editarCategoriaSkill(catKill);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCategoriaSkill (@PathVariable Long id){
        interCatSkill.borrarCategoriaSkill(id);
    }

}
