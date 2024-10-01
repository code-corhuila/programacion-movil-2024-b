package com.corhuila.Parcial.Service;

import com.corhuila.Parcial.Entitity.Materia;
import com.corhuila.Parcial.IRepository.IBaseRepository;
import com.corhuila.Parcial.IRepository.IMateriaRepository;
import com.corhuila.Parcial.IService.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService extends ABaseService<Materia> implements IMateriaService {
    @Override
    protected IBaseRepository<Materia, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IMateriaRepository repository;
}