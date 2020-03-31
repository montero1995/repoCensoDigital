package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.FrecuenciaIngresoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrecuenciaIngresoRepository  extends JpaRepository<FrecuenciaIngresoEntity,Integer> {
}
