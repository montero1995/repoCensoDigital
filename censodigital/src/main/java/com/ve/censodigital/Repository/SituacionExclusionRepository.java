package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.SituacionExclusionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituacionExclusionRepository extends JpaRepository<SituacionExclusionEntity,Integer> {
}
