package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.NacionalidadEntity;
import com.ve.censodigital.Entity.SexoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<SexoEntity, Integer> {
}
