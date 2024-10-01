package com.corhuila.Parcial.Service;

import com.corhuila.Parcial.Entitity.Estudiante;
import com.corhuila.Parcial.IRepository.IBaseRepository;
import com.corhuila.Parcial.IRepository.IEstudianteRepository;
import com.corhuila.Parcial.IService.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService extends ABaseService<Estudiante> implements IEstudianteService {
    @Override
    protected IBaseRepository<Estudiante, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IEstudianteRepository repository;
}