package com.example.demo;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Movement extends Controller {

    public static void move_p1(int x_cor, int y_cor, int pos, ImageView cir) throws IOException {

        if (Player1.first_time_moved_p1==0) {

            TranslateTransition trr = new TranslateTransition();

            trr.setToX(x_cor);
            trr.setToY(y_cor);
            trr.setDuration(Duration.millis(700));
            trr.setNode(cir);
            trr.play();
            Controller.flag=true;
            Player1.first_time_moved_p1=1;
            Player1.returned_from_p1=0;
            return;

        }

        if (Snakes.snake_start.contains(pos)){

            TranslateTransition trr = new TranslateTransition();

            trr.setToX(x_cor);
            trr.setToY(y_cor);
            trr.setDuration(Duration.millis(700));
            trr.setNode(cir);
            trr.play();
            Controller.flag=true;

            int down = 0;

            for (int i = 0 ; i<Snakes.snake_pos.size() ; i++) {
                if (Snakes.snake_pos.get(i).get(0)==pos){
                    down = Snakes.snake_pos.get(i).get(1);
                }
            }

            int xxx = Coordinates.grid.get(down-1).get(0);
            int yyy = Coordinates.grid.get(down-1).get(1);

            trr.setOnFinished(e -> {

                TranslateTransition tr = new TranslateTransition();
                tr.setToX(xxx);
                tr.setToY(yyy);
                tr.setDuration(Duration.millis(700));
                tr.setNode(cir);
                tr.play();
                Controller.flag=true;

            });

            Player1.p1_pos = down;


        } else if(Ladders.ladder_start.contains(pos)) {

            TranslateTransition trr = new TranslateTransition();

            trr.setToX(x_cor);
            trr.setToY(y_cor);
            trr.setDuration(Duration.millis(700));
            trr.setNode(cir);
            trr.play();
            Controller.flag=true;

            int up = 0;

            for (int i = 0 ; i<Ladders.ladder_pos.size() ; i++) {
                if (Ladders.ladder_pos.get(i).get(0)==pos){
                    up = Ladders.ladder_pos.get(i).get(1);
                }
            }


            int xxx = Coordinates.grid.get(up-1).get(0);
            int yyy = Coordinates.grid.get(up-1).get(1);

            trr.setOnFinished(e -> {

                TranslateTransition tr = new TranslateTransition();
                tr.setToX(xxx);
                tr.setToY(yyy);
                tr.setDuration(Duration.millis(700));
                tr.setNode(cir);
                tr.play();
                Controller.flag=true;

            });

            Player1.p1_pos = up;

        } else {

            TranslateTransition translate = new TranslateTransition();

            translate.setToX(x_cor);
            translate.setToY(y_cor);
            translate.setDuration(Duration.millis(700));
            translate.setNode(cir);
            translate.play();
            Controller.flag=true;

            if(Player1.p1_pos==100)
            {
                translate.setOnFinished(e -> {
                    try {
                        Controller.win_1();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
            }
        }

    }

    public static void move_p2(int x_cor, int y_cor, int pos, ImageView cir_p2) throws IOException {

        if (Player2.first_time_moved_p2==0) {

            TranslateTransition trr = new TranslateTransition();

            trr.setToX(x_cor);
            trr.setToY(y_cor);
            trr.setDuration(Duration.millis(700));
            trr.setNode(cir_p2);
            trr.play();
            Controller.flag=true;
            Player2.first_time_moved_p2=1;
            Player2.returned_from_p2=0;
            return;

        }

        if (Snakes.snake_start.contains(pos)){

            TranslateTransition trr = new TranslateTransition();

            trr.setToX(x_cor);
            trr.setToY(y_cor+7);
            trr.setDuration(Duration.millis(700));
            trr.setNode(cir_p2);
            trr.play();
            Controller.flag=true;

            int down = 0;

            for (int i = 0 ; i<Snakes.snake_pos.size() ; i++) {
                if (Snakes.snake_pos.get(i).get(0)==pos){
                    down = Snakes.snake_pos.get(i).get(1);
                }
            }


            int xxx = Coordinates.grid.get(down-1).get(0);
            int yyy = Coordinates.grid.get(down-1).get(1);

            trr.setOnFinished(e -> {

                TranslateTransition tr = new TranslateTransition();
                tr.setToX(xxx);
                tr.setToY(yyy+7);
                tr.setDuration(Duration.millis(700));
                tr.setNode(cir_p2);
                tr.play();
                Controller.flag=true;

            });

            Player2.p2_pos = down;


        } else if(Ladders.ladder_start.contains(pos)) {

            TranslateTransition trr = new TranslateTransition();

            trr.setToX(x_cor);
            trr.setToY(y_cor+7);
            trr.setDuration(Duration.millis(700));
            trr.setNode(cir_p2);
            trr.play();
            Controller.flag=true;

            int up = 0;

            for (int i = 0 ; i<Ladders.ladder_pos.size() ; i++) {
                if (Ladders.ladder_pos.get(i).get(0)==pos){
                    up = Ladders.ladder_pos.get(i).get(1);
                }
            }


            int xxx = Coordinates.grid.get(up-1).get(0);
            int yyy = Coordinates.grid.get(up-1).get(1);

            trr.setOnFinished(e -> {

                TranslateTransition tr = new TranslateTransition();
                tr.setToX(xxx);
                tr.setToY(yyy+7);
                tr.setDuration(Duration.millis(700));
                tr.setNode(cir_p2);
                tr.play();
                Controller.flag=true;

            });

            Player2.p2_pos = up;

        } else {

            TranslateTransition translate = new TranslateTransition();
            translate.setToX(x_cor);
            translate.setToY(y_cor+7);
            translate.setDuration(Duration.millis(700));
            translate.setNode(cir_p2);
            translate.play();
            Controller.flag=true;

            if(Player2.p2_pos==100)
            {
                translate.setOnFinished(e -> {
                    try {
                        Controller.win_2();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });

            }

        }

    }

}
