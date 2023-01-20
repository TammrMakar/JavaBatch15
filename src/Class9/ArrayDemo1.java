package Class9;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        String name="slava";
        String name2="Safi";
        String name3="Jason";
        String name4="Nabi";
        String name5="Anees";

    String [] names={"Slava","Safi","jason","Nabi","Anees","tamer"};

        System.out.println(name2);
        System.out.println(names[1]);
        System.out.println(names[3]);
        System.out.println(names[5]);
       // System.out.println(names[500]);error because there is no name on index number 500\
       // System.out.println(names[-5]);error because index can't be negative.
        for(int i=0;i<6;i++){
            System.out.println(names[i]);
    }}}


