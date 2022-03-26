package co.com.sofka.mentoring35.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import co.com.sofka.mentoring35.model.Dado;

public interface DadoRepository extends ReactiveMongoRepository<Dado,String>{
    
}
