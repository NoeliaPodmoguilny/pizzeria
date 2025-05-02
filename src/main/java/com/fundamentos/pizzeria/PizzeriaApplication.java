package com.fundamentos.pizzeria;

import com.fundamentos.pizzeria.application.SistemaPizzariaFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzeriaApplication {

    public static void main(String[] args) {
//		SpringApplication.run(PizzeriaApplication.class, args);
        Application.launch(SistemaPizzariaFx.class, args);
    }

}
