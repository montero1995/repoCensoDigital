package com.ve.censodigital.Controller;

import com.ve.censodigital.Entity.CensoDigitalEntity;
import com.ve.censodigital.Entity.UsuarioEntity;
import com.ve.censodigital.Service.CensoDigitalService;
import com.ve.censodigital.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @Autowired
    CensoDigitalService censoDigitalService;

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

    @PostMapping("/mailOlvidoContraseña")
        ModelAndView mailOlvidoContraseña(@RequestParam(value = "email", required = true) String email,
                                          @RequestParam(value = "password", required = true) String password){
           ModelAndView modelAndView = new ModelAndView();
           Boolean existeMail;
        existeMail= loginService.existeMail(email);
        if(existeMail){
           loginService.actualizarContrasenia(email,password);
            modelAndView.setViewName("login");
            return modelAndView;
        }
        modelAndView.addObject("modalEmailExits",true);
        modelAndView.setViewName("olvidoContraseña");
           return modelAndView;
        }
@PostMapping("/guardarNuevaContraseña")
 ModelAndView  guardarNuevaContraseña(@RequestParam(value = "email", required = false) String email,
                                      @RequestParam(value = "password", required = false) String password){
        ModelAndView modelAndView = new ModelAndView();
        loginService.guardarNuevaContraseña(email,password);
        modelAndView.setViewName("login");
        return modelAndView;
}

    @PostMapping("/guardarUsuario")
    ModelAndView guardarUsuario(UsuarioEntity usuarioEntity) {
        ModelAndView modelAndView= new ModelAndView();
        Boolean usuarioExistente=false;
        try {
            usuarioExistente=  loginService.salvarNuevoUsuario(usuarioEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(usuarioExistente == false){
            modelAndView.addObject("modalEmailExits",true);
            modelAndView.setViewName("crearUsuario");
            return modelAndView;
        }
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("/indexPr")
    ModelAndView home( HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView= new ModelAndView();
        List<CensoDigitalEntity> censoDigitalEntityList= new ArrayList<>();
        try {
            censoDigitalEntityList=  censoDigitalService.obtenerTodosLosCensos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.addObject("censoDigitalEntityList",censoDigitalEntityList);
        httpServletRequest.getSession().removeAttribute("censoDigitalEntitySession");
        modelAndView.setViewName("index");
        return modelAndView;
    }


}
