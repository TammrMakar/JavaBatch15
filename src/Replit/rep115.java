package Replit;

import org.w3c.dom.ls.LSOutput;

class Main {

    String values;
    double values1;
    int number;
    float number1;
    boolean values2;

    Main(double num,String str,int num1,boolean values2,float num2) {

        values1 = num;
        values = str;
        number = num1;
        values2=false;
        number1=num2;


    }

    void printInfo(){
        System.out.println(number);
        System.out.println(values);
        System.out.println(number1);
        System.out.println(values2);
        System.out.println(values1);
    }

    public static void main(String[] args) {
        Main main=new Main(0,null,0,false,0);
        main.printInfo();
    }
}














