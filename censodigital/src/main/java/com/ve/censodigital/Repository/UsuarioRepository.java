package com.ve.censodigital.Repository;

import com.ve.censodigital.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Gerardo Montero on 09/12/2019.
 */
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {

    UsuarioEntity findByEmailUsuario(String email);
}
