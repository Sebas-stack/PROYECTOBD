package com.example.PROYECTOBD.REPOSITORIO;

import com.example.PROYECTOBD.MODELOS.InicioSesion;
import com.example.PROYECTOBD.MODELOS.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InicioSesionRepositorio extends JpaRepository<InicioSesion, Long> {
}
