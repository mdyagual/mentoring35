package co.com.sofka.mentoring35;

import co.com.sofka.mentoring35.model.Dado;
import co.com.sofka.mentoring35.service.DadoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class PostRolledDiceTest {
    @Autowired
    DadoService dadoService;

    @Test
    void postTest(){
        Dado dado = new Dado();
        Mono<Dado> dadoMono= dadoService.saveRoll(dado);
        StepVerifier.create(dadoMono).expectNext(dado).verifyComplete();

    }


}
