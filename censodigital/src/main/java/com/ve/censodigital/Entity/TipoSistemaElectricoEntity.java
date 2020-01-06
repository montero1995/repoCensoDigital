package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_sistema_electrico")
public class TipoSistemaElectricoEntity {
    @Id
    @Column(name = "id_tipo_sistema_electrico")
    private Integer idTipoSistemaElectrico;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoSistemaElectricoEntity() {
    }

    public TipoSistemaElectricoEntity(Integer idTipoSistemaElectrico, String descripcion) {
        this.idTipoSistemaElectrico = idTipoSistemaElectrico;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoSistemaElectrico() {
        return idTipoSistemaElectrico;
    }

    public void setIdTipoSistemaElectrico(Integer idTipoSistemaElectrico) {
        this.idTipoSistemaElectrico = idTipoSistemaElectrico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
