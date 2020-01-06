package com.ve.censodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_animal")
public class AnimalEntity {
    @Id
    @Column(name = "id_animal")
    private Integer idAnimal;

    @Column(name = "descripcion")
    private  String descripcion;


    public AnimalEntity() {
    }

    public AnimalEntity(Integer idAnimal, String descripcion) {
        this.idAnimal = idAnimal;
        this.descripcion = descripcion;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
