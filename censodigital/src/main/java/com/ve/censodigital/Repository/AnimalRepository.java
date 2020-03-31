package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity,Integer> {
}
