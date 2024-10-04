package com.example.PROYECTOBD.REPOSITORIO;

import com.example.PROYECTOBD.MODELOS.Comunidad_Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Comunidad_OrganizacionRepositorio extends JpaRepository<Comunidad_Organizacion, Long> {
}
