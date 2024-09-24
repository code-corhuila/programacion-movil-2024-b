package com.corhuila.BackendFuenteHidrica.Service;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;
import com.corhuila.BackendFuenteHidrica.Entity.Usuario;
import com.corhuila.BackendFuenteHidrica.IRepository.IPersonaRepository;
import com.corhuila.BackendFuenteHidrica.IRepository.IUsuarioRepository;
import com.corhuila.BackendFuenteHidrica.IService.IPersonaService;
import com.corhuila.BackendFuenteHidrica.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;

    @Autowired
    private IPersonaRepository repositoryPersona;

    @Override
    public List<Usuario> All() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuario> FindById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void Update(Usuario usuario, Long id) {
        //Primero consultar
        Optional<Usuario> ps = FindById(id);

        if (ps.isEmpty()) {
            throw new RuntimeException("Usuario no encontrado con el ID: " + id);
        }else{
            //Validar si el objeto ps está lleno o no.
            Usuario usuarioUpdate = ps.get();
            usuarioUpdate.setUsuario(usuario.getUsuario());
            usuarioUpdate.setContrasenia(usuario.getContrasenia());
            usuarioUpdate.setPersonaId(usuario.getPersonaId());

            repository.save(usuarioUpdate);
        }
    }

    @Override
    public void Delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Usuario Save(Usuario usuario) {

        //Primero consultar si existe la persona

        Optional<Persona> ps = repositoryPersona.findById(usuario.getPersonaId().getId());

        if (ps.isEmpty()) {
            throw new RuntimeException("Persona no encontrada con el ID: " + usuario.getPersonaId().getId());
        }else{
            return repository.save(usuario);
        }

    }
}
