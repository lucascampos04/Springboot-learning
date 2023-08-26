package com.springboot.springbootessentials.Controller;

import com.springboot.springbootessentials.domain.Anime;
import com.springboot.springbootessentials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController // Indica que esta classe é um controlador que retorna JSON
@RequestMapping("anime") // Define a rota base para as URLs deste controlador
@Log4j2 // Configura o uso do log4j2 para logs
@AllArgsConstructor // Gera um construtor que recebe todas as dependências como argumentos
public class AnimeController {
    private DateUtil dateUtil; // Injeção da dependência DateUtil

    // Rota para localhost:8080/anime/list
    @GetMapping(path="list")
    public List<Anime> list(){
        log.info(DateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now())); // Registra a data e hora no log
        return List.of(new Anime("DBZ"), new Anime("Naruto")); // Retorna uma lista de animes
    }
}
