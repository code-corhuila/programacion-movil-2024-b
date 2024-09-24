package com.corhuila.BackendFuenteHidrica.IRepository;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
