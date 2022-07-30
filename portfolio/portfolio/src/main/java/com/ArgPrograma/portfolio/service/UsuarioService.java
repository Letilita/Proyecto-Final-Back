
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.exceptions.UserNotFoundException;
import com.ArgPrograma.portfolio.model.Usuario;
import com.ArgPrograma.portfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> traerUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public void editarUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }
    
}
