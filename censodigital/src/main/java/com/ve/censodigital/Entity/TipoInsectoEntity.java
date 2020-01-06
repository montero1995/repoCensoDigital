package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_insecto")
public class TipoInsectoEntity {
    @Id
    @Column(name = "id_tipo_insecto")
    private Integer idTipoInsecto;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoInsectoEntity() {
    }

    public TipoInsectoEntity(Integer idTipoInsecto, String descripcion) {
        this.idTipoInsecto = idTipoInsecto;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoInsecto() {
        return idTipoInsecto;
    }

    public void setIdTipoInsecto(Integer idTipoInsecto) {
        this.idTipoInsecto = idTipoInsecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
