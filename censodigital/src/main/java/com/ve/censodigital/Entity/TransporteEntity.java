package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_transporte")
public class TransporteEntity {

    @Id
    @Column(name = "id_transporte")
    private Integer idTransporte;

    @Column(name = "descripcion")
    private String descripcion;

    public TransporteEntity() {
    }

    public TransporteEntity(Integer idTransporte, String descripcion) {
        this.idTransporte = idTransporte;
        this.descripcion = descripcion;
    }

    public Integer getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Integer idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
