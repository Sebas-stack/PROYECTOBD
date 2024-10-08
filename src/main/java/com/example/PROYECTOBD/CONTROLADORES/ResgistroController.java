package com.example.PROYECTOBD.CONTROLADORES;

import com.example.PROYECTOBD.MODELOS.Donante;
import com.example.PROYECTOBD.MODELOS.InicioSesion;
import com.example.PROYECTOBD.MODELOS.Registro;
import com.example.PROYECTOBD.REPOSITORIO.InicioSesionRepositorio;
import com.example.PROYECTOBD.REPOSITORIO.RegirtroRepositorio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ResgistroController {

    RegirtroRepositorio repositorio;

    public ResgistroController(RegirtroRepositorio repository){
        this.repositorio = repository;
    }

    @GetMapping("/api/createDate")
    public void crearRegistro(){
        Registro registro = new Registro(1L,"sebastian","sebasgut38@gmail.com","12345678", InicioSesion.class.cast(2));

        repositorio.save(registro);


    }
    @GetMapping("/api/registros")
    public List<Registro> obtenerRegristros(){
        return repositorio.findAll();

    }


    @GetMapping("/api/registro/{id}")
    public ResponseEntity<Registro> obtenerPeliculas (@PathVariable Long id){
        repositorio.findById(id);
        Optional<Registro> opt = repositorio.findById(id);

        return opt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @CrossOrigin("http://127.0.0.1:55209")
    @PostMapping("/api/peliculas")
    public ResponseEntity<Registro> guardarRegistro(@RequestBody Registro registro) {
        if(registro.getId()!=null){
            return ResponseEntity.badRequest().build();
        }

        repositorio.save(registro);
        return  ResponseEntity.ok(registro);
    }
    @CrossOrigin("http://127.0.0.1:90001")
    @PutMapping("/api/peliculas")
    public ResponseEntity<Registro> actualizarRegistro(@RequestBody Registro registro) {
        if(registro.getId()==null || repositorio.existsById(registro.getId())){
            return ResponseEntity.badRequest().build();
        }

        repositorio.save(registro);
        return  ResponseEntity.ok(registro);
    }

    @CrossOrigin("http://127.0.0.1:90001")
    @DeleteMapping("/api/peliculas")
    public ResponseEntity<Registro> borrarRegistro(@PathVariable Long id) {
        if(id==null || repositorio.existsById(id)){
            return ResponseEntity.badRequest().build();
        }

        repositorio.deleteById(id);
        return  ResponseEntity.noContent().build();
    }



    public class InicioSesionControlloer {
        InicioSesionRepositorio repositorio;

        public InicioSesionControlloer(InicioSesionRepositorio repository){
            this.repositorio = repository;
        }

        @GetMapping("/api/creainiciosesion")
        public void crearRegistro(){
            InicioSesion inicioSesion = new InicioSesion(4L,"sebasgut38@gail.com","12345678",Registro.class.cast(4), Donante.class.cast(1));

            repositorio.save(inicioSesion);


        }
        @GetMapping("/api/registros")
        public List<InicioSesion> obtenerRegristros(){
            return repositorio.findAll();

        }


        @GetMapping("/api/r-iniciosesion/{id}")
        public ResponseEntity<InicioSesion> obtenerPeliculas (@PathVariable Long id){
            repositorio.findById(id);
            Optional<InicioSesion> opt = repositorio.findById(id);

            if (opt.isEmpty()) {
                return ResponseEntity.badRequest().build();
            }else{
                return ResponseEntity.ok(opt.get());
            }
        }

        @CrossOrigin("http://127.0.0.1:90001")
        @PostMapping("/api/sesiones")
        public ResponseEntity<InicioSesion> guardarInicioSesion(@RequestBody InicioSesion inicioSesion) {
            if(inicioSesion.getId()!=null){
                return ResponseEntity.badRequest().build();
            }

            repositorio.save(new InicioSesion());
            return  ResponseEntity.ok(inicioSesion);
        }
        @CrossOrigin("http://127.0.0.1:90001")
        @PutMapping("/api/sesiones")
        public ResponseEntity<InicioSesion> actualizarInicioSesion(@RequestBody InicioSesion inicioSesion) {
            if(inicioSesion.getId()==null || repositorio.existsById(inicioSesion.getId())){
                return ResponseEntity.badRequest().build();
            }

            repositorio.save(inicioSesion);
            return  ResponseEntity.ok(inicioSesion);
        }

        @CrossOrigin("http://127.0.0.1:55209")
        @DeleteMapping("/api/iniciosesion")
        public ResponseEntity<InicioSesion> borrarIniciosSesion(@PathVariable Long id) {
            if(id==null || repositorio.existsById(id)){
                return ResponseEntity.badRequest().build();
            }

            repositorio.deleteById(id);
            return  ResponseEntity.noContent().build();
        }

    }



}
