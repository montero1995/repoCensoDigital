package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoAguasBlancasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AguasBlancasRepository extends JpaRepository<TipoAguasBlancasEntity,Integer> {
}
