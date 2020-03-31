package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoMecanismoInformacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMecanismoInformacionRepository extends JpaRepository<TipoMecanismoInformacionEntity,Integer> {
}
