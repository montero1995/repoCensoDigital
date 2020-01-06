package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_techo")
public class TipoTechoEntity {
    @Id
    @Column(name = "id_tipo_techo")
    private  Integer idTipoTecho;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoTechoEntity() {
    }

    public TipoTechoEntity(Integer idTipoTecho, String descripcion) {
        this.idTipoTecho = idTipoTecho;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoTecho() {
        return idTipoTecho;
    }

    public void setIdTipoTecho(Integer idTipoTecho) {
        this.idTipoTecho = idTipoTecho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
