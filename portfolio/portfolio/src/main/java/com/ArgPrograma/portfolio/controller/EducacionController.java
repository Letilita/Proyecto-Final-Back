
package com.ArgPrograma.portfolio.controller;

import com.ArgPrograma.portfolio.model.Educacion;
import com.ArgPrograma.portfolio.service.IEducacionService;
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
@RequestMapping("/Educacion")
public class EducacionController {
    @Autowired
    private IEducacionService interEdu;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<Educacion> leerEducaciones(){
        return interEdu.traerEducaciones();
    }
    
    @PostMapping("/agregar")
    public void agregarEducacion(@RequestBody Educacion edu){
        interEdu.crearEducacion(edu);
    }
    
    @PutMapping("/editar")
    public void editarEducacion(@RequestBody Educacion edu){
        interEdu.editarEducacion(edu);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarEducacion (@PathVariable Long id){
        interEdu.borrarEducacion(id);
    }
}
