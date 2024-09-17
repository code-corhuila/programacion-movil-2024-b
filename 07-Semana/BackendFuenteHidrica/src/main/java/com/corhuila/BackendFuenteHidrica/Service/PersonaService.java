package com.corhuila.BackendFuenteHidrica.Service;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;
import com.corhuila.BackendFuenteHidrica.IRepository.IPersonaRepository;
import com.corhuila.BackendFuenteHidrica.IService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository repository;

    @Override
    public List<Persona> All() {
        return repository.findAll();
    }

    @Override
    public Optional<Persona> FindById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void Update(Persona persona, Long id) {
        //Verificar si existe el dato.

        // Reemplazar el dato que guardado por el nuevo

    }

    @Override
    public void Delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Persona Save(Persona persona) {
        return repository.save(persona);
    }
}
