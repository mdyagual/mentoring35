package co.com.sofka.mentoring35.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.mentoring35.model.Dado;
import co.com.sofka.mentoring35.service.DadoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.sql.Timestamp;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/appDado")
public class DadoController {

    @Autowired
    DadoService dadoService;

    @GetMapping("/allRolls")
    public Flux<Dado> historialLanzamientos(){
        return dadoService.getAllRoll();
    }    

    @PostMapping("/saveRoll")
    public Mono<Dado> guardarLanzamiento(){
        return dadoService.saveRoll(new Dado());
    }

    @DeleteMapping("/deleteRoll/{id}")
    public void eliminarLanzamiento(@PathVariable("id") String id){
        dadoService.deleteRoll(id);
    }

    @DeleteMapping("/deleteAllRolls")
    public void eliminarLanzamiento(){
        dadoService.deleteAllRolls();
    }
}
