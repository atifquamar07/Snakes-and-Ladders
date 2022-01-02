package com.example.demo;

import java.util.*;

public class Coordinates {

    static ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

    static int check = 0;

    public static void add_points() {

        int y1 = 489;
        int y2 = 447;
        int y3 = 396;
        int y4 = 345;
        int y5 = 294;
        int y6 = 243;
        int y7 = 192;
        int y8 = 141;
        int y9 = 90;
        int y10 = 39;

        int x1 = 85;
        int x2 = 526;
        int x3 = 85;
        int x4 = 526;
        int x5 = 85;
        int x6 = 526;
        int x7 = 85;
        int x8 = 526;
        int x9 = 85;
        int x10 = 526;

        for(int i = 0 ; i<10 ; i++) {

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x1);
            temp.add(y1);
            grid.add(temp);
            x1 = x1+49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x2);
            temp.add(y2);
            grid.add(temp);
            x2-=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x3);
            temp.add(y3);
            grid.add(temp);
            x3+=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x4);
            temp.add(y4);
            grid.add(temp);
            x4-=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x5);
            temp.add(y5);
            grid.add(temp);
            x5+=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x6);
            temp.add(y6);
            grid.add(temp);
            x6-=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x7);
            temp.add(y7);
            grid.add(temp);
            x7+=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x8);
            temp.add(y8);
            grid.add(temp);
            x8-=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x9);
            temp.add(y9);
            grid.add(temp);
            x9+=49;

        }

        for(int i = 0 ; i<10 ; i++){

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x10);
            temp.add(y10);
            grid.add(temp);
            x10-=49;

        }

        check = 1;

    }

}
