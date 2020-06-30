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
public  void guardarNuevaContraseña(String email,String password){
        UsuarioEntity usuarioEntity = new UsuarioEntity();
    usuarioEntity = usuarioRepository.findByEmailUsuario(email);
    try {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        usuarioEntity.setContraseña(bCryptPasswordEncoder.encode(password));
        usuarioEntity.setEmailUsuario(email.toLowerCase());
        usuarioRepository.save(usuarioEntity);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public List<GrantedAuthority> obtenerRol(String rol) {
         rol="Administrador";
        List<GrantedAuthority> auths = new ArrayList<>();

        auths.add(new SimpleGrantedAuthority(rol));

        return auths;
    }

    public  boolean existeMail(String email){
        UsuarioEntity existeUsuario = new UsuarioEntity();

        try {
            existeUsuario = usuarioRepository.findByEmailUsuario(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (existeUsuario !=null) {
            return true;
        }
        return false;
    }

    public void actualizarContrasenia(String email,String newPassword){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        usuarioRepository.findByEmailUsuario(email);
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity=usuarioRepository.findByEmailUsuario(email);
        usuarioEntity.setContraseña(bCryptPasswordEncoder.encode(newPassword));
        usuarioRepository.save(usuarioEntity);
    }

}
