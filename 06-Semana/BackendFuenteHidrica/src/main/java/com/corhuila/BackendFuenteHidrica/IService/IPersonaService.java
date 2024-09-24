package com.corhuila.BackendFuenteHidrica.IService;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    /*Listar todo*/
    List<Persona> All();

    /*Buscar por id*/
    Optional<Persona> FindById(Long id);

    /*Editar por id*/
     void Update(Persona persona, Long id);

    /*Eliminar por id*/
    void Delete(Long id);

    /*Guardar*/
    Persona Save(Persona persona);
}
