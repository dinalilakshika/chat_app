package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Server.Server;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class WelcomeFormController implements Initializable {
    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    void btnSingInOnAction(ActionEvent event){
        try {
            Server server = Server.getServerSocket();
            Thread thread = new Thread(server);
            thread.start();

            root.getChildren().clear();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/singin_form.fxml"))));
            stage.show();
            stage.setOnCloseRequest(e-> {
                System.exit(0);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
