package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name ="t_cantidad_ingreso")
public class CantidadIngresoEntity {
    @Id
    @Column(name = "id_cantidad_ingreso")
    private Integer idCantidadIngreso;

    @Column(name = "cantidad")
    private String cantidad;

    public CantidadIngresoEntity() {
    }

    public CantidadIngresoEntity(Integer idCantidadIngreso, String cantidad) {
        this.idCantidadIngreso = idCantidadIngreso;
        this.cantidad = cantidad;
    }

    public Integer getIdCantidadIngreso() {
        return idCantidadIngreso;
    }

    public void setIdCantidadIngreso(Integer idCantidadIngreso) {
        this.idCantidadIngreso = idCantidadIngreso;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
