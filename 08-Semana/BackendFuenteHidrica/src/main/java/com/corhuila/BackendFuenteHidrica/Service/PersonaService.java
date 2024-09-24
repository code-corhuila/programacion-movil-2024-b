package com.corhuila.BackendFuenteHidrica.Service;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;
import com.corhuila.BackendFuenteHidrica.Entity.Usuario;
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
        //Primero consultar
        Optional<Persona> ps = FindById(id);

        if (ps.isEmpty()) {
            throw new RuntimeException("Persona no encontrado con el ID: " + id);
        }else{
            //Validar si el objeto ps está lleno o no.
            Persona personaUpdate = ps.get();
            personaUpdate.setNombre(persona.getNombre());
            personaUpdate.setApellido(persona.getApellido());
            personaUpdate.setCorreo(persona.getCorreo());

            repository.save(personaUpdate);
        }
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
