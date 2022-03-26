package co.com.sofka.mentoring35.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.mentoring35.model.Dado;
import co.com.sofka.mentoring35.service.DadoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
    public Mono<Dado> guardarLanzamiento(@RequestBody Dado d){
        return dadoService.saveRoll(d);
    }
}
