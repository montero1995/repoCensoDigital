package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_sector_trabajo")
public class SectorTrabajoEntity {
    @Id
    @Column(name = "id_sector_trabajo")
    private  Integer idSectorTrabajo;

    @Column(name = "descripcion")
    private String descripcion;

    public SectorTrabajoEntity() {
    }

    public SectorTrabajoEntity(Integer idSectorTrabajo, String descripcion) {
        this.idSectorTrabajo = idSectorTrabajo;
        this.descripcion = descripcion;
    }

    public Integer getIdSectorTrabajo() {
        return idSectorTrabajo;
    }

    public void setIdSectorTrabajo(Integer idSectorTrabajo) {
        this.idSectorTrabajo = idSectorTrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
