package com.corhuila.Parcial.Entitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia extends ABaseEntity{
    @Column(name = "codigo", length = 20)
    private String codigo;

    @Column(name = "nombre", length = 20)
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
