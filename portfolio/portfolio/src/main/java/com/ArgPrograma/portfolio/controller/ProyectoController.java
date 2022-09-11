 
package com.ArgPrograma.portfolio.controller;

import com.ArgPrograma.portfolio.model.Proyecto;
import com.ArgPrograma.portfolio.service.IProyectoService;
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
@RequestMapping("/Proyectos")
@CrossOrigin
public class ProyectoController {
    @Autowired
    private IProyectoService interProy;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<Proyecto> leerProyectos(){
        return interProy.traerProyectos();
    }
    
    @PostMapping("/agregar")
    public void agregarProyecto(@RequestBody Proyecto proy){
        interProy.crearProyecto(proy);
    }
    
    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proy){
        interProy.editarProyecto(proy);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProyecto (@PathVariable Long id){
        interProy.borrarProyecto(id);
    }
} 
