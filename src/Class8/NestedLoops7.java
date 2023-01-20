package Class8;

public class NestedLoops7 {
    public static void main(String[] args) {
   /*       0 1 2 3 4 5
            1 2 3 4 5
            2 3 4 5

         */

        //way1

        for (int i = 0; i < 1; i++) {   // executed the below code 1 time

            for (int j = 0; j <= 5; j++) {
                System.out.print(j + " ");// prints the value of j from 0 to 5
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {   // executed the below code 1 time

            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");// prints the value of j from 1 to 5
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) { // executed the below code 1 time

            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " ");// prints the value of j from 2 to 5
            }
            System.out.println();
        }

   //way2
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}