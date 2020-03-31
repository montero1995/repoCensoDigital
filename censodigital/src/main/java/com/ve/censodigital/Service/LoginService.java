package com.ve.censodigital.Service;

import com.ve.censodigital.Entity.UsuarioEntity;
import com.ve.censodigital.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gerardo Montero on 09/12/2019.
 */
@Service
public class LoginService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Boolean salvarNuevoUsuario(UsuarioEntity usuarioEntity) {
        String correoUsuario = usuarioEntity.getEmailUsuario();
        UsuarioEntity existeUsuario = new UsuarioEntity();

        try {
            existeUsuario = usuarioRepository.findByEmailUsuario(correoUsuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (existeUsuario !=null) {
            return false;
        }

        try {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
            usuarioEntity.setContraseña(bCryptPasswordEncoder.encode(usuarioEntity.getContraseña()));
            usuarioEntity.setEmailUsuario(usuarioEntity.getEmailUsuario().toLowerCase());
            usuarioRepository.save(usuarioEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public List<GrantedAuthority> obtenerRol(String rol) {
         rol="Administrador";
        List<GrantedAuthority> auths = new ArrayList<>();

        auths.add(new SimpleGrantedAuthority(rol));

        return auths;
    }

}
