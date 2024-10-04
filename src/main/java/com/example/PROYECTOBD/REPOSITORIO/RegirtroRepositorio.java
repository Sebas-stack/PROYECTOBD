package com.example.PROYECTOBD.REPOSITORIO;

import com.example.PROYECTOBD.MODELOS.Donacion;
import com.example.PROYECTOBD.MODELOS.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegirtroRepositorio extends JpaRepository<Registro, Long> {
}
