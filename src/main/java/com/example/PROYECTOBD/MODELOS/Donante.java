package com.example.PROYECTOBD.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="donante")
public class Donante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_O_razonSocila;
    private LocalDate fechaNacimiento;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String correo;
    private String estado;
    private String ciudad;
    private String barrio;
    private String direccion;
    private String telefono;

    @ManyToMany(mappedBy = "donante")
    private List<Donacion> donacion;

    @OneToOne
    @JoinColumn(name="inicioSesion-id")
    private InicioSesion inicioSesion;

    public Donante() {
    }

    public Donante(Long id, String nombre_O_razonSocila, LocalDate fechaNacimiento, String tipoIdentificacion, String numeroIdentificacion, String correo, String estado, String ciudad, String barrio, String direccion, String telefono, List<Donacion> donacion, InicioSesion inicioSesion) {
        this.id = id;
        this.nombre_O_razonSocila = nombre_O_razonSocila;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correo = correo;
        this.estado = estado;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.donacion = donacion;
        this.inicioSesion = inicioSesion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_O_razonSocila() {
        return nombre_O_razonSocila;
    }

    public void setNombre_O_razonSocila(String nombre_O_razonSocila) {
        this.nombre_O_razonSocila = nombre_O_razonSocila;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Donacion> getDonacion() {
        return donacion;
    }

    public void setDonacion(List<Donacion> donacion) {
        this.donacion = donacion;
    }

    public InicioSesion getInicioSesion() {
        return inicioSesion;
    }

    public void setInicioSesion(InicioSesion inicioSesion) {
        this.inicioSesion = inicioSesion;
    }

    @Override
    public String toString() {
        return "Donante{" +
                "id=" + id +
                ", nombre_O_razonSocila='" + nombre_O_razonSocila + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", correo='" + correo + '\'' +
                ", estado='" + estado + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", barrio='" + barrio + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
