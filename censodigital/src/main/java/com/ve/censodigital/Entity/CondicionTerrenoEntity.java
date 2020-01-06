package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_condicion_terreno")
public class CondicionTerrenoEntity {

    @Id
    @Column(name = "id_condicion_terreno")
    private  Integer idCondicionTerreno;

    @Column(name = "descripcion")
    private  String descripcion;

    public CondicionTerrenoEntity() {
    }

    public CondicionTerrenoEntity(Integer idCondicionTerreno, String descripcion) {
        this.idCondicionTerreno = idCondicionTerreno;
        this.descripcion = descripcion;
    }

    public Integer getIdCondicionTerreno() {
        return idCondicionTerreno;
    }

    public void setIdCondicionTerreno(Integer idCondicionTerreno) {
        this.idCondicionTerreno = idCondicionTerreno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
