package Class9;

public class ArrayDemo2 {
    public static void main(String[] args) {

  // 10 20 30 45 50


        int [] numbers={10,20,30,45,50};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("***********");
        //write code to add all the numbers from an array

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
    }
        System.out.println(sum);
}}


