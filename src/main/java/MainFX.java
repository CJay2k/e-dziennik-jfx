import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFX extends Application {

//    Function that runs login window
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxmls/login.fxml"));
        primaryStage.setTitle("Logowanie e-Dziennik");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}