package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.FormaTenenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaTenenciaRepository extends JpaRepository<FormaTenenciaEntity,Integer> {
}
