package Class12.PracticeAtHome;

import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("What's your name");
        String name= input.nextLine();
        System.out.println("My name is "+name);

        Scanner input1=new Scanner(System.in);
        System.out.println("I love my sons");
        boolean love=input.nextBoolean();
        System.out.println("I love my sons"+" and"+" My wife");

        Scanner input2=new Scanner(System.in);
        System.out.println("What's your age");
        int age=input.nextInt();
        System.out.println("I'm "+age+" years old");

        Scanner input3=new Scanner(System.in);
        System.out.println("What's your favorite number");
        int number=input.nextInt();
        System.out.println("My favorite number is "+number);



    }
}
