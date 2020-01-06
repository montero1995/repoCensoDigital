package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_comercio")
public class TipoComercioEntity {
    @Id
    @Column(name = "id_tipo_comercio")
    private  Integer idTipoComercio;

    @Column(name = "descripcion")
    private  String descripcion;

    public TipoComercioEntity() {
    }

    public TipoComercioEntity(Integer idTipoComercio, String descripcion) {
        this.idTipoComercio = idTipoComercio;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoComercio() {
        return idTipoComercio;
    }

    public void setIdTipoComercio(Integer idTipoComercio) {
        this.idTipoComercio = idTipoComercio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
