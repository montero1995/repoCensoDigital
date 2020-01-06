package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_aguas_servidas")
public class TipoAguasServidasEntity {
    @Id
    @Column(name = "id_tipo_aguas_servidas")
    private Integer idTipoAguasServidas;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoAguasServidasEntity() {
    }

    public TipoAguasServidasEntity(Integer idTipoAguasServidas, String descripcion) {
        this.idTipoAguasServidas = idTipoAguasServidas;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoAguasServidas() {
        return idTipoAguasServidas;
    }

    public void setIdTipoAguasServidas(Integer idTipoAguasServidas) {
        this.idTipoAguasServidas = idTipoAguasServidas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
