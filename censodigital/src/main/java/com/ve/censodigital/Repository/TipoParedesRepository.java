package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoParedesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoParedesRepository extends JpaRepository<TipoParedesEntity,Integer> {
}
