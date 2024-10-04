package com.example.PROYECTOBD.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="comunidadOrganizacion")
public class Comunidad_Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cantidad;
    private String identificacion;
    @ManyToOne
    @JoinColumn(name="comunidadOrganizacion_id")
    private Donacion donacion;


    public Comunidad_Organizacion() {
    }

    public Comunidad_Organizacion(Long id, String nombre, String cantidad, String identificacion, Donacion donacion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.identificacion = identificacion;
        this.donacion = donacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Donacion getDonacion() {
        return donacion;
    }

    public void setDonacion(Donacion donacion) {
        this.donacion = donacion;
    }

    @Override
    public String toString() {
        return "Comudad_Organizacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
