package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_gas")
public class TipoGasEntity {
    @Id
    @Column(name = "id_tipo_gas")
    private Integer idTipoGas;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoGasEntity() {
    }

    public TipoGasEntity(Integer idTipoGas, String descripcion) {
        this.idTipoGas = idTipoGas;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoGas() {
        return idTipoGas;
    }

    public void setIdTipoGas(Integer idTipoGas) {
        this.idTipoGas = idTipoGas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
