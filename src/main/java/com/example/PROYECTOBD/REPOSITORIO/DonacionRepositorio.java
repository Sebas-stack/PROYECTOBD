package com.example.PROYECTOBD.REPOSITORIO;

import com.example.PROYECTOBD.MODELOS.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonacionRepositorio   extends JpaRepository<Donacion, Long> {

}
