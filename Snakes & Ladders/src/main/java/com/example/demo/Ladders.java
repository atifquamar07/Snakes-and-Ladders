package com.example.demo;

import java.util.ArrayList;

public class Ladders {

    public static final ArrayList<ArrayList<Integer>> ladder_pos = new ArrayList<>();
    public static final ArrayList<Integer> ladder_start = new ArrayList<>();

    public static int check_ladder = 0;

    public static void add_ladders() {

        ArrayList<Integer> s1 = new ArrayList<>();
        s1.add(5);
        s1.add(17);
        ladder_start.add(5);
        ladder_pos.add(s1);

        ArrayList<Integer> s2 = new ArrayList<>();
        s2.add(7);
        s2.add(15);
        ladder_pos.add(s2);
        ladder_start.add(7);

        ArrayList<Integer> s3 = new ArrayList<>();
        s3.add(9);
        s3.add(13);
        ladder_pos.add(s3);
        ladder_start.add(9);

        ArrayList<Integer> s4 = new ArrayList<>();
        s4.add(33);
        s4.add(47);
        ladder_pos.add(s4);
        ladder_start.add(33);

        ArrayList<Integer> s5 = new ArrayList<>();
        s5.add(35);
        s5.add(45);
        ladder_pos.add(s5);
        ladder_start.add(35);

        ArrayList<Integer> s6 = new ArrayList<>();
        s6.add(37);
        s6.add(43);
        ladder_pos.add(s6);
        ladder_start.add(37);

        ArrayList<Integer> s7 = new ArrayList<>();
        s7.add(40);
        s7.add(81);
        ladder_pos.add(s7);
        ladder_start.add(40);

        ArrayList<Integer> s8 = new ArrayList<>();
        s8.add(64);
        s8.add(83);
        ladder_pos.add(s8);
        ladder_start.add(64);

        ArrayList<Integer> s9 = new ArrayList<>();
        s9.add(66);
        s9.add(85);
        ladder_pos.add(s9);
        ladder_start.add(66);

        ArrayList<Integer> s10 = new ArrayList<>();
        s10.add(68);
        s10.add(87);
        ladder_pos.add(s10);
        ladder_start.add(68);

        check_ladder = 1;

    }

}
