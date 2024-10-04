package com.example.PROYECTOBD.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String correo;
    private String contrasena;

    @OneToOne(
            mappedBy = "registro"
    )
    private InicioSesion inicioSesion;

    public Registro() {
    }

    public Registro(Long id, String usuario, String correo, String contrasena, InicioSesion inicioSesion) {
        this.id = id;
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.inicioSesion = inicioSesion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public InicioSesion getInicioSesion() {
        return inicioSesion;
    }

    public void setInicioSesion(InicioSesion inicioSesion) {
        this.inicioSesion = inicioSesion;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }

}
