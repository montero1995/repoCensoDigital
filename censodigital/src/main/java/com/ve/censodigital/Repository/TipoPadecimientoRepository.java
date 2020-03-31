package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoPadecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPadecimientoRepository extends JpaRepository<TipoPadecimientoEntity,Integer> {
}
