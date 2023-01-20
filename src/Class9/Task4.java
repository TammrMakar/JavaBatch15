package Class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

   //4) Write a program to ask a user to enter item they want to buy and the price of that item.
        // Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        // If user give more money program should return a change.
        // Whenever a user done with payments program should say "Thank you for shopping!"

        Scanner scanner=new Scanner(System.in);
        double totalprice=0;
        for (int i = 0; i < 1; i++) {

        System.out.println("Please enter your item and its price");
        String itemname= scanner.next();
        double itemprice= scanner.nextDouble();
       totalprice=totalprice+itemprice;
            System.out.println("this is the total amount that you have to pay "+totalprice);
    }
        System.out.println("Please pay for the items");
        double amountpaid=scanner.nextDouble();

        if(amountpaid>totalprice){
            double change=amountpaid-totalprice;
            System.out.println("Hey here is your change ");
        }else if(amountpaid<totalprice){
            System.out.println("thanks for your shopping");
        }
}}

