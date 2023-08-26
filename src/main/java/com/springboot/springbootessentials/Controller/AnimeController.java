package com.springboot.springbootessentials.Controller;

import com.springboot.springbootessentials.domain.Anime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Api - o foco é retorna somente o JSON
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path="list")
    public List<Anime> list(){
        return List.of(new Anime("DBZ"), new Anime("Naruto"));
    }
}
