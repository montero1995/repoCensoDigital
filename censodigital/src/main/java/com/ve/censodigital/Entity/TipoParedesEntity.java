package com.ve.censodigital.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_paredes")
public class TipoParedesEntity {
    @Id
    @Column(name = "id_tipo_paredes")
    private  Integer idTipoParedes;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoParedesEntity() {
    }

    public TipoParedesEntity(Integer idTipoParedes, String descripcion) {
        this.idTipoParedes = idTipoParedes;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoParedes() {
        return idTipoParedes;
    }

    public void setIdTipoParedes(Integer idTipoParedes) {
        this.idTipoParedes = idTipoParedes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
