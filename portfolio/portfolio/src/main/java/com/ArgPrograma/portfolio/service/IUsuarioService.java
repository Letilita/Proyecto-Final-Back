package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> traerUsuario();
    public void editarUsuario(Usuario usuario);
    public Usuario buscarUsuario(Long id);
    public void crearUsuario(Usuario usuario);
    
}
