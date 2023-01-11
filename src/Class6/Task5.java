package Class6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Please enter three numbers");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("the  largest number is number " + number1);
        }else if(number2>number1&&number2>number3){
            System.out.println("the  largest number is number " + number2);
        }else if (number3>number1&&number3>number2){
            System.out.println("the  largest number is number " + number3);
        }
    }
}
