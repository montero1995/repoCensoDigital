package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.CantidadIngresoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CantidadIngresoRepository extends JpaRepository<CantidadIngresoEntity,Integer> {
}
