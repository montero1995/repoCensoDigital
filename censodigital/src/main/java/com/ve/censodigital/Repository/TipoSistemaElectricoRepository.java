package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoSistemaElectricoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSistemaElectricoRepository extends JpaRepository<TipoSistemaElectricoEntity,Integer> {
}
