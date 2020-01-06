package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_telefonia")
public class TelefoniaEntity {

    @Id
    @Column(name = "id_telefonia")
    private Integer idTelefonia;

    @Column(name = "descripcion")
    private String descripcion;

    public TelefoniaEntity() {
    }

    public TelefoniaEntity(Integer idTelefonia, String descripcion) {
        this.idTelefonia = idTelefonia;
        this.descripcion = descripcion;
    }

    public Integer getIdTelefonia() {
        return idTelefonia;
    }

    public void setIdTelefonia(Integer idTelefonia) {
        this.idTelefonia = idTelefonia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
