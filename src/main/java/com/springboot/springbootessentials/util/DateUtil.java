package com.springboot.springbootessentials.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component // Marca a classe como um componente gerenciado pelo Spring
public class DateUtil {

    // Formata um objeto LocalDateTime para um formato de data e hora de banco de dados
    public static String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
