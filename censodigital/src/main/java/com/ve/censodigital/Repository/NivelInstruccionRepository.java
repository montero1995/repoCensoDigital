package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.NivelInstruccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelInstruccionRepository extends JpaRepository<NivelInstruccionEntity, Integer> {
}
