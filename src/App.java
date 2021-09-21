import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {      
       
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
       Parent root = fxmlLoader.load();
       Scene tela = new Scene(root);
       
       primaryStage.setTitle("Teste JavaFX Boladão");
       primaryStage.setScene(tela);
       primaryStage.show();
    }
}