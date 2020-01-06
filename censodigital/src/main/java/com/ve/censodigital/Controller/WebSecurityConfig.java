package com.ve.censodigital.Controller;


import com.ve.censodigital.Service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


//Indica que esta clase es de configuracion y necesita ser cargada durante el inicio del server
@Configuration
@EnableAutoConfiguration
//Indica que esta clase sobreescribira la implmentacion de seguridad web
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    String[] resources = new String[]{
            "/include/**", "/css/**", "/icons/**", "/img/**", "/js/**", "/layer/**"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(resources).permitAll()
                .antMatchers( "/indexPr*").permitAll()
                .antMatchers("/olvidoContraseña").permitAll()
                .antMatchers("/crearUsuario").permitAll()
                .antMatchers("/indexPr").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/indexPr")
                .failureUrl("/login?error=true")
                .usernameParameter("email")
                .passwordParameter("contraseña")
                .and()
                .csrf().disable()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/login?logout");
    }

   // BCryptPasswordEncoder bCryptPasswordEncoder;
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();}
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
//        return bCryptPasswordEncoder;
//    }

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/font-awesome/**","/js/**", "/static/**", "/fonts/**","/bootstrap/**","/error");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //Especificar el encargado del login y encriptacion del password
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
}