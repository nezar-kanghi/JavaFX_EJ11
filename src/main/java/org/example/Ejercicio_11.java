package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio_11 extends Application {

    @Override
    public void start(Stage stage) {

        TextField txtNombre   = new TextField();
        TextField txtEmail    = new TextField();
        PasswordField txtPass = new PasswordField(); //como el de texto pero muestra circulitos
        Button btnEnviar      = new Button("Enviar");
        Label lblMensaje      = new Label("");

        btnEnviar.setOnAction(event -> {
            // .isEmpty() devuelve true si el campo está vacío
            // .trim() elimina espacios, evita que espacios cuelen como texto válido
            if (txtNombre.getText().trim().isEmpty() ||
                    txtEmail.getText().trim().isEmpty()  ||
                    txtPass.getText().trim().isEmpty()) {

                lblMensaje.setText("Rellena todos los campos");
            } else {
                lblMensaje.setText("Formulario enviado correctamente");
            }
        });

        // Metemos labels y campos alternados en el VBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                new Label("Nombre:"),     txtNombre,
                new Label("Email:"),      txtEmail,
                new Label("Contraseña:"), txtPass,
                btnEnviar, lblMensaje
        );

        Scene scene = new Scene(layout, 300, 250);
        stage.setTitle("Ejercicio 11");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}