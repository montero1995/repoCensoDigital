package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_tipo_recoleccion_basura")
public class TipoRecoleccionBasuraEntity {
    @Id
    @Column(name = "id_tipo_recoleccion_basura")
    private Integer idTipoRecoleccionBasura;

    @Column(name = "descripcion")
    private  String descripcion;

    public TipoRecoleccionBasuraEntity() {
    }

    public TipoRecoleccionBasuraEntity(Integer idTipoRecoleccionBasura, String descripcion) {
        this.idTipoRecoleccionBasura = idTipoRecoleccionBasura;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoRecoleccionBasura() {
        return idTipoRecoleccionBasura;
    }

    public void setIdTipoRecoleccionBasura(Integer idTipoRecoleccionBasura) {
        this.idTipoRecoleccionBasura = idTipoRecoleccionBasura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
