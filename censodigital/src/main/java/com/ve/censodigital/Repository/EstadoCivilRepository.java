package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.EstadoCivilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoCivilRepository extends JpaRepository<EstadoCivilEntity,Integer> {
}
