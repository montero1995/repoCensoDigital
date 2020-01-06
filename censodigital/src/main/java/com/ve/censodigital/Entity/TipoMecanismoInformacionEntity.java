package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_mecanismo_informacion")
public class TipoMecanismoInformacionEntity {

    @Id
    @Column(name = "id_tipo_mecanismo_informacion")
    private Integer idMecanismoInformacion;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoMecanismoInformacionEntity() {
    }

    public TipoMecanismoInformacionEntity(Integer idMecanismoInformacion, String descripcion) {
        this.idMecanismoInformacion = idMecanismoInformacion;
        this.descripcion = descripcion;
    }

    public Integer getIdMecanismoInformacion() {
        return idMecanismoInformacion;
    }

    public void setIdMecanismoInformacion(Integer idMecanismoInformacion) {
        this.idMecanismoInformacion = idMecanismoInformacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
