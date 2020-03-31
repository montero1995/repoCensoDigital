package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoTechoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTechoRepository extends JpaRepository<TipoTechoEntity,Integer> {
}
