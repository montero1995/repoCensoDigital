package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_aguas_blancas")
public class TipoAguasBlancasEntity {

    @Id
    @Column(name = "id_tipo_aguas_blancas")
    private  Integer idTipoAguasBlancas;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoAguasBlancasEntity() {
    }

    public TipoAguasBlancasEntity(Integer idTipoAguasBlancas, String descripcion) {
        this.idTipoAguasBlancas = idTipoAguasBlancas;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoAguasBlancas() {
        return idTipoAguasBlancas;
    }

    public void setIdTipoAguasBlancas(Integer idTipoAguasBlancas) {
        this.idTipoAguasBlancas = idTipoAguasBlancas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
