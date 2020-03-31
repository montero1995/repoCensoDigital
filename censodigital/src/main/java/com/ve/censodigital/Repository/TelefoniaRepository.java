package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TelefoniaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoniaRepository extends JpaRepository<TelefoniaEntity,Integer> {
}
