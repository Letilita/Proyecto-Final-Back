
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> traerEducaciones();
    public Educacion editarEducacion(Educacion educacion);
    public void crearEducacion(Educacion educacion);
    public void borrarEducacion (Long id);
    
}
