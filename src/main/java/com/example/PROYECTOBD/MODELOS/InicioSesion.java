package com.example.PROYECTOBD.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="inicioSesion")
public class InicioSesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String correo;
    private String contrasena;
    @OneToOne
    @JoinColumn(name="registro-id")
    private Registro registro;

    @OneToOne(
            mappedBy = "inicioSesion"
    )
    private Donante donante;
    public InicioSesion() {
    }

    public InicioSesion(Long id, String correo, String contrasena, Registro registro, Donante donante) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.registro = registro;
        this.donante = donante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Donante getDonante() {
        return donante;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    @Override
    public String toString() {
        return "InicioSesion{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
    
}
