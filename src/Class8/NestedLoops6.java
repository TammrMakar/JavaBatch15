package Class8;

public class NestedLoops6 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {  // executed the below code 3 times
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");// prints the value of j from 1 to 5
            }
            System.out.println();
        }
    }
}
