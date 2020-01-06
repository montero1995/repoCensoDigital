package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_padecimiento")
public class TipoPadecimientoEntity {

    @Id
    @Column(name = "id_tipo_padecimiento")
    private Integer idTipoPadecimiento;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoPadecimientoEntity() {
    }

    public TipoPadecimientoEntity(Integer idTipoPadecimiento, String descripcion) {
        this.idTipoPadecimiento = idTipoPadecimiento;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoPadecimiento() {
        return idTipoPadecimiento;
    }

    public void setIdTipoPadecimiento(Integer idTipoPadecimiento) {
        this.idTipoPadecimiento = idTipoPadecimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
