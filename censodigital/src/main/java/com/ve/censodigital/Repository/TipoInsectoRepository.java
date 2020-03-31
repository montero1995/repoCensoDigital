package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoInsectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoInsectoRepository extends JpaRepository<TipoInsectoEntity,Integer> {
}
