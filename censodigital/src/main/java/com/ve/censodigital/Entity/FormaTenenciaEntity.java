package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_forma_tenencia")
public class FormaTenenciaEntity {
    @Id
    @Column(name = "id_forma_tenencia")
    private Integer idFormaTenencia;

    @Column(name = "descripcion")
    private String descripcion;

    public FormaTenenciaEntity() {
    }

    public FormaTenenciaEntity(Integer idFormaTenencia, String descripcion) {
        this.idFormaTenencia = idFormaTenencia;
        this.descripcion = descripcion;
    }

    public Integer getIdFormaTenencia() {
        return idFormaTenencia;
    }

    public void setIdFormaTenencia(Integer idFormaTenencia) {
        this.idFormaTenencia = idFormaTenencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
