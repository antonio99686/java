import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginTela extends Application {

    @Override
    public void start(Stage stage) {

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #0f0f0f;");

        Label titulo = new Label("ACEB COHAB II");
        titulo.setTextFill(Color.RED);
        titulo.setFont(new Font("Arial", 28));

        VBox card = new VBox(10);
        card.setAlignment(Pos.CENTER);
        card.setStyle(
                "-fx-background-color: #1c1c1c;" +
                "-fx-padding: 30;" +
                "-fx-background-radius: 10;"
        );

        Label loginText = new Label("LOGIN");
        loginText.setTextFill(Color.WHITE);
        loginText.setFont(new Font(18));

        TextField email = new TextField();
        email.setPromptText("Email");
        email.setStyle("-fx-background-color: #2b2b2b; -fx-text-fill: white;");

        PasswordField senha = new PasswordField();
        senha.setPromptText("Senha");
        senha.setStyle("-fx-background-color: #2b2b2b; -fx-text-fill: white;");

        Button entrar = new Button("ENTRAR");
        entrar.setStyle(
                "-fx-background-color: red;" +
                "-fx-text-fill: white;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 10 20;"
        );

        Label esqueceu = new Label("Esqueceu sua senha?");
        esqueceu.setTextFill(Color.GRAY);

        card.getChildren().addAll(loginText, email, senha, entrar, esqueceu);

        root.getChildren().addAll(titulo, card);

        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}