package com.example.PROYECTOBD.CONTROLADORES;

import com.example.PROYECTOBD.MODELOS.InicioSesion;
import com.example.PROYECTOBD.MODELOS.Registro;
import com.example.PROYECTOBD.REPOSITORIO.RegirtroRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResgistroController {

    RegirtroRepositorio repositorio;

    public ResgistroController(RegirtroRepositorio repository){
        this.repositorio = repository;
    }

    @GetMapping("/api/createDate")
    public void crearRegistro(){
        Registro registro = new Registro(1L,"sebastian","sebasgut38@gmail.com","26558010", InicioSesion.class.cast(2));
        Registro registro2 = new Registro(1L,"sebastian","sebasgut38@gmail.com","26558010", InicioSesion.class.cast(2));
        Registro registro3 = new Registro(1L,"sebastian","sebasgut38@gmail.com","26558010", InicioSesion.class.cast(2));

            repositorio.save(registro);
            repositorio.save(registro2);
            repositorio.save(registro3);

    }
    @GetMapping("/api/date")
    public List<Registro> obtenerRegristro(){
        return repositorio.findAll();

    }


}
