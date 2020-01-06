package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_nacionalidad")
public class NacionalidadEntity {
    @Id
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    public NacionalidadEntity() {
    }

    public NacionalidadEntity(Integer idNacionalidad, String nacionalidad) {
        this.idNacionalidad = idNacionalidad;
        this.nacionalidad = nacionalidad;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}
