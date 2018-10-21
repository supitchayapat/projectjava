import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainApp.fxml"));
        primaryStage.setTitle(" Student Information");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public void onActionWelcomeToScen(ActionEvent actionEvent) throws Exception {
        Stage stage = new Stage();
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/view/infor.fxml"));
        StackPane root = new StackPane();
        Scene scene = new Scene(fxmlLoader, 1000.0, 100.0);
        stage.setScene(new Scene(fxmlLoader,1000,600));
        stage.setTitle("Profile Student");
        stage.setResizable(false);
        stage.show();
    }
}
