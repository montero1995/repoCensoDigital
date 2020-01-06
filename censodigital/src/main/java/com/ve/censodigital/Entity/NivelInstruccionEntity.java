package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_nivel_instruccion")
public class NivelInstruccionEntity {
    @Id
    @Column(name = "id_nivel_instruccion")
    private Integer idNivelInstruccion;

    @Column(name = "nivel_instruccion")
    private String nivelInstruccion;

    public NivelInstruccionEntity() {
    }

    public NivelInstruccionEntity(Integer idNivelInstruccion, String nivelInstruccion) {
        this.idNivelInstruccion = idNivelInstruccion;
        this.nivelInstruccion = nivelInstruccion;
    }

    public Integer getIdNivelInstruccion() {
        return idNivelInstruccion;
    }

    public void setIdNivelInstruccion(Integer idNivelInstruccion) {
        this.idNivelInstruccion = idNivelInstruccion;
    }

    public String getNivelInstruccion() {
        return nivelInstruccion;
    }

    public void setNivelInstruccion(String nivelInstruccion) {
        this.nivelInstruccion = nivelInstruccion;
    }
}
