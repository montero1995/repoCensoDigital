package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TransporteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTransporteRepository extends JpaRepository<TransporteEntity,Integer> {
}
