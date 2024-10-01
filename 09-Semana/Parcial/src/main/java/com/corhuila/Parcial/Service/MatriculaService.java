package com.corhuila.Parcial.Service;

import com.corhuila.Parcial.Entitity.Matricula;
import com.corhuila.Parcial.IRepository.IBaseRepository;
import com.corhuila.Parcial.IRepository.IMatriculaRepository;
import com.corhuila.Parcial.IService.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService extends ABaseService<Matricula> implements IMatriculaService {
    @Override
    protected IBaseRepository<Matricula, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IMatriculaRepository repository;
}