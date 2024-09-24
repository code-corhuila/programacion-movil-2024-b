package com.corhuila.BackendFuenteHidrica.IRepository;

import com.corhuila.BackendFuenteHidrica.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
