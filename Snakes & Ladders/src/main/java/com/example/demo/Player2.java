package com.example.demo;

public class Player2 {

    static int p2_pos=1;
    static int curr_rand_no;
    static int first_time_moved_p2 = 0;
    static int returned_from_p2 = 0;
    static int one_more_chance_p2 = 0;

    void fun_p2() {

        if (first_time_moved_p2==0) {
            if (curr_rand_no==1){
                Controller.setX_coordinate_p2(100);
                Controller.setY_coordinate_p2(498);
                returned_from_p2 = 0;
                one_more_chance_p2 = 1;
            } else {
                returned_from_p2 = 1;
            }
            return;
        }

        if (p2_pos==95 && curr_rand_no>=5) {
            return;
        } else if (p2_pos==96 && curr_rand_no>4){
            return;
        } else if (p2_pos==97 && curr_rand_no>3){
            return;
        } else if (p2_pos==98 && curr_rand_no>2){
            return;
        } else if (p2_pos==99 && curr_rand_no>1){
            return;
        }else if (p2_pos==100){
            return;
        }

        p2_pos+=curr_rand_no;

        int x_c = Coordinates.grid.get(p2_pos-1).get(0);
        int y_c = Coordinates.grid.get(p2_pos-1).get(1);

        Controller.setX_coordinate_p2(x_c);
        Controller.setY_coordinate_p2(y_c);
        Controller.setPosition_of_p2(p2_pos);

    }

}
