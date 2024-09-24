package com.corhuila.BackendFuenteHidrica.IService;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;
import com.corhuila.BackendFuenteHidrica.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    /*Listar todo*/
    List<Usuario> All();

    /*Buscar por id*/
    Optional<Usuario> FindById(Long id);

    /*Editar por id*/
     void Update(Usuario usuario, Long id);

    /*Eliminar por id*/
    void Delete(Long id);

    /*Guardar*/
    Usuario Save(Usuario usuario);
}
