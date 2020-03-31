package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.CondicionTerrenoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionTerrenoRepository extends JpaRepository<CondicionTerrenoEntity,Integer> {
}
