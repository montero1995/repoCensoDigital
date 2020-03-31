package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoAguasServidasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AguasServidasRepository extends JpaRepository<TipoAguasServidasEntity,Integer> {
}
