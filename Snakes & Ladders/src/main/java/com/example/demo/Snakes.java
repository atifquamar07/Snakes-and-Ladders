package com.example.demo;

import java.util.ArrayList;

public class Snakes {

    public static int getCheck_snake() {
        return check_snake;
    }

    static final ArrayList<ArrayList<Integer>> snake_pos = new ArrayList<>();
    static final ArrayList<Integer> snake_start = new ArrayList<>();

    private static int check_snake = 0;

    public static void add_snakes() {

        ArrayList<Integer> s1 = new ArrayList<>();
        s1.add(24);
        s1.add(18);
        snake_start.add(24);
        snake_pos.add(s1);

        ArrayList<Integer> s2 = new ArrayList<>();
        s2.add(26);
        s2.add(16);
        snake_pos.add(s2);
        snake_start.add(26);

        ArrayList<Integer> s3 = new ArrayList<>();
        s3.add(28);
        s3.add(14);
        snake_pos.add(s3);
        snake_start.add(28);

        ArrayList<Integer> s4 = new ArrayList<>();
        s4.add(55);
        s4.add(34);
        snake_pos.add(s4);
        snake_start.add(55);

        ArrayList<Integer> s5 = new ArrayList<>();
        s5.add(57);
        s5.add(36);
        snake_pos.add(s5);
        snake_start.add(57);

        ArrayList<Integer> s6 = new ArrayList<>();
        s6.add(59);
        s6.add(38);
        snake_pos.add(s6);
        snake_start.add(59);

        ArrayList<Integer> s7 = new ArrayList<>();
        s7.add(91);
        s7.add(50);
        snake_pos.add(s7);
        snake_start.add(91);

        ArrayList<Integer> s8 = new ArrayList<>();
        s8.add(95);
        s8.add(74);
        snake_pos.add(s8);
        snake_start.add(95);

        ArrayList<Integer> s9 = new ArrayList<>();
        s9.add(97);
        s9.add(76);
        snake_pos.add(s9);
        snake_start.add(97);

        ArrayList<Integer> s10 = new ArrayList<>();
        s10.add(99);
        s10.add(78);
        snake_pos.add(s10);
        snake_start.add(99);

        check_snake = 1;

    }

}
