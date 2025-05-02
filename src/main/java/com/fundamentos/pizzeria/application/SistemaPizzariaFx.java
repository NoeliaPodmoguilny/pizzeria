package com.fundamentos.pizzeria.application;

import com.fundamentos.pizzeria.PizzeriaApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class SistemaPizzariaFx extends Application {

    private ConfigurableApplicationContext applicationContext;

//    public static void main(String[] args) {
//        launch(args);
//    }


    // Cargamos el contexto de SpringBoot
    @Override
    public void init() throws Exception {
        this.applicationContext = new SpringApplicationBuilder(PizzeriaApplication.class).run();
    }

    // Cargamos en memoria la interfaz
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(PizzeriaApplication.class.getResource("/template/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);

        // configuraciones de FX
        Scene escena = new Scene(loader.load());
        stage.setScene(escena);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
        Platform.exit();
    }
}
