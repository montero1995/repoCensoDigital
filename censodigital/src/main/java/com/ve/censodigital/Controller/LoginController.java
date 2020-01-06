package com.ve.censodigital.Controller;

import com.ve.censodigital.Entity.UsuarioEntity;
import com.ve.censodigital.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    ModelAndView modelAndView() {
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("/crearUsuario")
    ModelAndView creacionUsuario() {
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("crearUsuario");
        return modelAndView;
    }

    @GetMapping("/olvidoContraseña")
    ModelAndView olvidoContraseña() {
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("olvidoContraseña");
        return modelAndView;
    }


    @PostMapping("/guardarUsuario")
    ModelAndView guardarUsuario(UsuarioEntity usuarioEntity) {
        ModelAndView modelAndView= new ModelAndView();
       Boolean guardarUsuario= loginService.salvarNuevoUsuario(usuarioEntity);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("/indexPr")
    ModelAndView home() {
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("indexPr");
        return modelAndView;
    }


}
