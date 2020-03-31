package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoGasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoGasRepositoy extends JpaRepository<TipoGasEntity,Integer> {
}
