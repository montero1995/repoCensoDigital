package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_frecuencia_ingreso")
public class FrecuenciaIngresoEntity {

    @Id
    @Column(name = "id_frecuencia_ingreso")
    private  Integer idFrecuenciaIngreso;

    @Column(name = "frecuencia")
    private  String frecuencia;

    public FrecuenciaIngresoEntity() {
    }

    public FrecuenciaIngresoEntity(Integer idFrecuenciaIngreso, String frecuencia) {
        this.idFrecuenciaIngreso = idFrecuenciaIngreso;
        this.frecuencia = frecuencia;
    }

    public Integer getIdFrecuenciaIngreso() {
        return idFrecuenciaIngreso;
    }

    public void setIdFrecuenciaIngreso(Integer idFrecuenciaIngreso) {
        this.idFrecuenciaIngreso = idFrecuenciaIngreso;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
}
