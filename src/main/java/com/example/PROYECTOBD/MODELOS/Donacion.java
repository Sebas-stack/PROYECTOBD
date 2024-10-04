package com.example.PROYECTOBD.MODELOS;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="donacion")
public class Donacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoDonacoion;
    private String caracteristicasDonacion;

    @OneToMany(mappedBy = "donacion")
    private List<Comunidad_Organizacion> ComudadOrganizacion;

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name="donaciones",
            joinColumns = @JoinColumn(name = "donacion_id"),
            inverseJoinColumns = @JoinColumn(name = "donante_id")
    )
    private List<Donante> donante;

    public Donacion() {
    }

    public Donacion(Long id, String tipoDonacoion, String caracteristicasDonacion, List<Comunidad_Organizacion> comudadOrganizacion, List<Donante> donante) {
        this.id = id;
        this.tipoDonacoion = tipoDonacoion;
        this.caracteristicasDonacion = caracteristicasDonacion;
        ComudadOrganizacion = comudadOrganizacion;
        this.donante = donante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDonacoion() {
        return tipoDonacoion;
    }

    public void setTipoDonacoion(String tipoDonacoion) {
        this.tipoDonacoion = tipoDonacoion;
    }

    public String getCaracteristicasDonacion() {
        return caracteristicasDonacion;
    }

    public void setCaracteristicasDonacion(String caracteristicasDonacion) {
        this.caracteristicasDonacion = caracteristicasDonacion;
    }

    public List<Comunidad_Organizacion> getComudadOrganizacion() {
        return ComudadOrganizacion;
    }

    public void setComudadOrganizacion(List<Comunidad_Organizacion> comudadOrganizacion) {
        ComudadOrganizacion = comudadOrganizacion;
    }

    public List<Donante> getDonante() {
        return donante;
    }

    public void setDonante(List<Donante> donante) {
        this.donante = donante;
    }

    @Override
    public String toString() {
        return "Donacion{" +
                "id=" + id +
                ", tipoDonacoion='" + tipoDonacoion + '\'' +
                ", caracteristicasDonacion='" + caracteristicasDonacion + '\'' +
                '}';
    }
}
