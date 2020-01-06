package com.ve.censodigital.Entity;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_situacion_exclusion")
public class SituacionExclusionEntity {
    @Id
    @Column(name = "id_situacion_exclusion")
    private Integer idSituacionExclusion;

    @Column(name = "descripcion")
    private String descripcion;

    public SituacionExclusionEntity() {
    }

    public SituacionExclusionEntity(Integer idSituacionExclusion, String descripcion) {
        this.idSituacionExclusion = idSituacionExclusion;
        this.descripcion = descripcion;
    }

    public Integer getIdSituacionExclusion() {
        return idSituacionExclusion;
    }

    public void setIdSituacionExclusion(Integer idSituacionExclusion) {
        this.idSituacionExclusion = idSituacionExclusion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
