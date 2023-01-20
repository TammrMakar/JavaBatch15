package Class9;

import java.util.Scanner;

public class task3anotherwayofanswer {
    public static void main(String[] args) {
        ///3) Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();

        System.out.println("start "+start+" end "+end);

        int evensum=0;
        int oddsum=0;
        for(int i=start;i<=end;i++){
            if (i % 2 == 0) {
                evensum+=i;  //can also be written like this
            }else{
                oddsum=oddsum+i;//can also be written like this oddSum+=1
            }
        }
        System.out.println("Sum of all the even numbers "+evensum);
        System.out.println("Sum of all the even numbers "+oddsum);
    }
}


