package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.CensoDigitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CensoDigitalRepository extends JpaRepository<CensoDigitalEntity,Integer> {
}
