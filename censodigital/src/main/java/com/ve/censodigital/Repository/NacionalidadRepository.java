package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.NacionalidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NacionalidadRepository extends JpaRepository<NacionalidadEntity, Integer> {
}
