package Class9;

public class Task1 {
    public static void main(String[] args) {


        ///1) Print numbers from 1 to 50 except those that are divisible by 3

        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0)
                System.out.println(i);
        }

        System.out.println("*************************");

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);

            }
        }
    }}
