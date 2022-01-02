package com.example.demo;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;


public class Controller implements Initializable  {

    public static boolean flag = true;

    private static int out;
    private static int chance = 1;

    private static int x_coordinate_p1;
    private static int y_coordinate_p1;
    private static int position_of_p1;

    private static int x_coordinate_p2;
    private static int y_coordinate_p2;
    private static int position_of_p2;

    private static Stage stage;
    private static Scene scene;
    private static Parent root;


    @FXML
    static ImageView pl1;

    @FXML
    static ImageView pl2;

    @FXML
    private ImageView cir_p1;

    @FXML
    private ImageView cir_p2;

    @FXML
    private ImageView diceImage;

    @FXML
    private ImageView arrow;

    @FXML
    private Button rollButton;

    @FXML
    private Text p1_chance;


    @FXML
    public void roll(ActionEvent actionEvent) throws IOException {

        Random rand = new Random();

        flag=false;

        if (Coordinates.check==0) {
            Coordinates.add_points();
        }

        if (Snakes.getCheck_snake() ==0) {
            Snakes.add_snakes();
        }

        if (Ladders.check_ladder==0) {
            Ladders.add_ladders();
        }

        if (chance==1) {

            out = rand.nextInt(6)+1;
            rollButton.setDisable(true);

            Thread thread = new Thread() {

                public void run(){

                    try {
                        for (int i = 0; i < 15; i++) {
                            File file = new File("src/main/resources/dice" + out+".png");
                            diceImage.setImage(new Image(file.toURI().toString()));
                            Thread.sleep(0);
                        }
                        rollButton.setDisable(false);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            thread.start();
            Player1.curr_rand_no = out;
            Player1 obj = new Player1();
            obj.fun();

            if (Player1.returned_from_p1 == 0) {
                Movement.move_p1(x_coordinate_p1, y_coordinate_p1, position_of_p1, cir_p1);
            }

            chance = 2;
            p2_ch(p1_chance);

            if (Player1.one_more_chance_p1 == 1){
                chance = 1;
                p1_ch(p1_chance);
                Player1.one_more_chance_p1 = 0;
            }


        } else if (chance==2){

            out = rand.nextInt(6)+1;
            rollButton.setDisable(true);

            Thread thread = new Thread(){

                public void run(){

                    try {
                        for (int i = 0; i < 15; i++) {
                            File file = new File("src/main/resources/dice" + out+".png");
                            diceImage.setImage(new Image(file.toURI().toString()));
                            Thread.sleep(0);
                        }
                        rollButton.setDisable(false);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            thread.start();
            Player2.curr_rand_no = out;
            Player2 obj = new Player2();
            obj.fun_p2();

            if (Player2.returned_from_p2 == 0){
                Movement.move_p2(x_coordinate_p2, y_coordinate_p2, position_of_p2, cir_p2);
            }

            chance = 1;
            p1_ch(p1_chance);

            if (Player2.one_more_chance_p2 == 1){
                chance = 2;
                p2_ch(p1_chance);
                Player2.one_more_chance_p2 = 0;
            }


        }

    }

    @FXML
    public void Game(ActionEvent event) throws IOException {

        FXMLLoader scen2 = new FXMLLoader(Main.class.getResource("Game_Graphics.fxml"));
        root = scen2.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void win_1() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Player1_win.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 700);
        stage.setTitle("Snake");
        stage.setScene(scene);
        stage.show();

    }

    public static void win_2() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Player2_win.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 700);
        stage.setTitle("Snake");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if(flag)
        {
            TranslateTransition trans = new TranslateTransition();
            trans.setNode(arrow);
            trans.setDuration(Duration.millis(700));
            trans.setCycleCount(TranslateTransition.INDEFINITE);
            trans.setByY(5);
            trans.play();
        }
    }

    public static void setX_coor_p1(int x_coordinate_p1) {
        Controller.x_coordinate_p1 = x_coordinate_p1;
    }

    public static void setY_coordinate_p1(int y_coordinate_p1) {
        Controller.y_coordinate_p1 = y_coordinate_p1;
    }

    public static void setPosition_of_p1(int position_of_p1) {
        Controller.position_of_p1 = position_of_p1;
    }

    public static void setX_coordinate_p2(int x_coordinate_p2) {
        Controller.x_coordinate_p2 = x_coordinate_p2;
    }

    public static void setY_coordinate_p2(int y_coordinate_p2) {
        Controller.y_coordinate_p2 = y_coordinate_p2;
    }

    public static void setPosition_of_p2(int position_of_p2) {
        Controller.position_of_p2 = position_of_p2;
    }


    public static void p1_ch(Text t) {

        t.setText("Player1 Chance");

    }

    public static void p2_ch(Text t) {

        t.setText("Player2 Chance");

    }

}
