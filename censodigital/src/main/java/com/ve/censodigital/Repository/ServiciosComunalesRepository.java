package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.ServiciosComunalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosComunalesRepository extends JpaRepository<ServiciosComunalesEntity,Integer> {
}
