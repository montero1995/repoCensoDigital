package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_servicios_comunales")
public class ServiciosComunalesEntity {

    @Id
    @Column(name = "id_servicios_comunales")
    private Integer idServiciosComunales;

    @Column(name = "descripcion")
    private String descripcion;

    public ServiciosComunalesEntity() {
    }

    public ServiciosComunalesEntity(Integer idServiciosComunales, String descripcion) {
        this.idServiciosComunales = idServiciosComunales;
        this.descripcion = descripcion;
    }

    public Integer getIdServiciosComunales() {
        return idServiciosComunales;
    }

    public void setIdServiciosComunales(Integer idServiciosComunales) {
        this.idServiciosComunales = idServiciosComunales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
