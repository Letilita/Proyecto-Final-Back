
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.Educacion;
import com.ArgPrograma.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepository educacionRepo;

    @Override
    public List<Educacion> traerEducaciones() {
        return educacionRepo.findAll();
    }

    @Override
    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }
}
