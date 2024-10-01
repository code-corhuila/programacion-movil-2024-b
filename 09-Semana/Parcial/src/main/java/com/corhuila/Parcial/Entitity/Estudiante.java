package com.corhuila.Parcial.Entitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante extends ABaseEntity{
    @Column(name = "codigo", length = 20)
    private String codigo;

    @Column(name = "tipo_documento", length = 20)
    private String tipoDocumento;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @Column(name = "correo", length = 20)
    private String correo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
