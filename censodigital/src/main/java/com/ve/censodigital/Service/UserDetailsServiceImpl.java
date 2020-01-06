package com.ve.censodigital.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ve.censodigital.Entity.TipoAguasBlancasEntity;
import com.ve.censodigital.Entity.UsuarioEntity;
import com.ve.censodigital.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    LoginService loginService;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        //Buscar nombre de usuario en nuestra base de datos

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        try {
            usuarioEntity = usuarioRepository.findByEmailUsuario(email);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Crear y retornar Objeto de usuario soportado por Spring Security
        UserDetails user = (UserDetails) new User(usuarioEntity.getEmailUsuario(), usuarioEntity.getContraseña(), loginService.obtenerRol(null));
        return user;

    }

}
