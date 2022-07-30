
package com.ArgPrograma.portfolio.service;

import com.ArgPrograma.portfolio.model.CategoriaEducacion;
import com.ArgPrograma.portfolio.repository.CategoriaEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaEducacionService implements ICategoriaEducacionService{
    @Autowired
    public CategoriaEducacionRepository catEduRepo;

    @Override
    public List<CategoriaEducacion> traerCategoriaEducacion() {
       return catEduRepo.findAll();
    }

    @Override
    public CategoriaEducacion editarCategoriaEducacion(CategoriaEducacion cateEdu) {
        return catEduRepo.save(cateEdu);
    }

    @Override
    public void crearCategoriaEducacion(CategoriaEducacion cateEdu) {
        catEduRepo.save(cateEdu);
    }

    @Override
    public void borrarCategoriaEducacion(Long id) {
        catEduRepo.deleteById(id);
    }
}
