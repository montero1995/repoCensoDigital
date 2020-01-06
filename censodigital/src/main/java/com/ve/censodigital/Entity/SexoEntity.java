package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_sexo")
public class SexoEntity {

    @Id
    @Column(name = "id_sexo")
    private  Integer idSexo;

    @Column(name = "sexo")
    private String sexo;

    public SexoEntity() {
    }

    public SexoEntity(Integer idSexo, String sexo) {
        this.idSexo = idSexo;
        this.sexo = sexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
