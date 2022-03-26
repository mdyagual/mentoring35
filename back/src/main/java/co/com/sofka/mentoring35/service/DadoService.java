package co.com.sofka.mentoring35.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofka.mentoring35.model.Dado;
import co.com.sofka.mentoring35.repository.DadoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DadoService {
    @Autowired
    DadoRepository dadoRepo;

    public Flux<Dado> getAllRoll(){
        return dadoRepo.findAll();
    }

    public Mono<Dado> saveRoll(Dado dado){
        return dadoRepo.save(dado);
    }

    public void deleteRoll(String id){
        dadoRepo.deleteById(id);
    }

    public void deleteAllRolls(){
        dadoRepo.deleteAll();
    }
}
