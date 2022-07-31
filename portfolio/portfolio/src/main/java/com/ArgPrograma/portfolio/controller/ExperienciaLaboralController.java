
package com.ArgPrograma.portfolio.controller;

import com.ArgPrograma.portfolio.model.ExperienciaLaboral;
import com.ArgPrograma.portfolio.service.IExperienciaLaboralService;
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
@RequestMapping("/Experiencia")
@CrossOrigin(origins= "http://localhost:4200")
public class ExperienciaLaboralController {
    @Autowired
    private IExperienciaLaboralService interExp;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<ExperienciaLaboral> leerExperiencia(){
        return interExp.traerExperiencias();
    }
    
    @PostMapping("/agregar")
    public void agregarExperiencia(@RequestBody ExperienciaLaboral exp){
        interExp.crearExperiencia(exp);
    }
    
    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody ExperienciaLaboral exp){
        interExp.editarExperiencia(exp);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarExperiencia (@PathVariable Long id){
        interExp.borrarExperiencia(id);
    }
    
}
