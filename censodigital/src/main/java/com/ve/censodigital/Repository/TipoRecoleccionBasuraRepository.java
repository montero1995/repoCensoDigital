package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.TipoRecoleccionBasuraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRecoleccionBasuraRepository extends JpaRepository<TipoRecoleccionBasuraEntity,Integer> {
}
