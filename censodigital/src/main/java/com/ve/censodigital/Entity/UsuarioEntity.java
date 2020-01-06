package com.ve.censodigital.Entity;

import javax.persistence.*;

/**
 * Created by Gerardo Montero on 08/12/2019.
 */
@Entity
@Table(name = "t_usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "usuario_seq")
    @SequenceGenerator(name = "usuario_seq",
            sequenceName = "usuario_seq", allocationSize = 1)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "email_usuario")
    private String emailUsuario;

    @Column(name = "contraseña")
    private String contraseña;

    public UsuarioEntity() {
    }

    public UsuarioEntity(String emailUsuario, String contraseña) {
        this.emailUsuario = emailUsuario;
        this.contraseña = contraseña;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
