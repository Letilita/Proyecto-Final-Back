
package com.ArgPrograma.portfolio.controller;

import com.ArgPrograma.portfolio.model.Usuario;
import com.ArgPrograma.portfolio.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins= "http://localhost:4200")
public class UsuarioController {
    @Autowired
    private IUsuarioService interUsuario;
    
    @GetMapping("/id/{id}")
    @ResponseBody
    public Usuario leerUsuario(@PathVariable("id") Long id){        
        return interUsuario.buscarUsuario(id);
    }
    
    @PutMapping("/editar")
    public void editarUsuario(@RequestBody Usuario usuario){
    interUsuario.editarUsuario(usuario);
}
    @PostMapping("/agregar/usuario")
    public void agregarUsuario(@RequestBody Usuario usuario){
        interUsuario.crearUsuario(usuario);
    }
}