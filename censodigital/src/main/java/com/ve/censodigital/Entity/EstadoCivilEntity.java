package com.ve.censodigital.Entity;

import javax.persistence.*;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_estado_civil")
public class EstadoCivilEntity {
    @Id
    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;

    @Column(name = "descripcion")
    private  String descripcion;

    public EstadoCivilEntity() {
    }

    public EstadoCivilEntity(Integer idEstadoCivil, String descripcion) {
        this.idEstadoCivil = idEstadoCivil;
        this.descripcion = descripcion;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
