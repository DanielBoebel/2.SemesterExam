package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(hBox, 400, 275));
        primaryStage.show();
        VBox vbox = new VBox();
        VBox vbox1 = new VBox();
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Label frame = new Label("First name:");
        frame.setFont(new Font("Times new Roman", 27));
        Label ln = new Label("Last name:");
        ln.setTextFill(Color.BLUE);
        ln.setFont(new Font("Times new Roman", 27));
        Label cl = new Label("Class:");
        cl.setTextFill(Color.CYAN);
        cl.setFont(new Font("Times new Roman", 27));
        Label pn = new Label("Phone number:");
        pn.setTextFill(Color.GREEN);
        pn.setFont(new Font("Times new Roman", 27));
        vbox1.getChildren().addAll(t1, t2, t3, t4);
        vbox.getChildren().addAll(frame, ln, cl, pn);
        hBox.getChildren().addAll(vbox, vbox1);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
