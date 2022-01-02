package com.example.demo;

public class Player1 {

    static int p1_pos=1;
    static int curr_rand_no;
    static int first_time_moved_p1 = 0;
    static int returned_from_p1 = 0;
    static int one_more_chance_p1 = 0;

     void fun() {

         if (first_time_moved_p1==0) {
             if (curr_rand_no==1){
                 Controller.setX_coor_p1(85);
                 Controller.setY_coordinate_p1(498);
                 returned_from_p1 = 0;
                 one_more_chance_p1 = 1;
             } else {
                 returned_from_p1 = 1;
             }
             return;
         }

         else if (p1_pos==95 && curr_rand_no>=5) {
             return;
         } else if (p1_pos==96 && curr_rand_no>4){
             return;
         } else if (p1_pos==97 && curr_rand_no>3){
             return;
         } else if (p1_pos==98 && curr_rand_no>2){
             return;
         } else if (p1_pos==99 && curr_rand_no>1){
             return;
         }else if (p1_pos==100){
             return;
         }

         p1_pos+=curr_rand_no;

         int x_c = Coordinates.grid.get(p1_pos-1).get(0);
         int y_c = Coordinates.grid.get(p1_pos-1).get(1);

         Controller.setX_coor_p1(x_c);
         Controller.setY_coordinate_p1(y_c);
         Controller.setPosition_of_p1(p1_pos);

    }


}
