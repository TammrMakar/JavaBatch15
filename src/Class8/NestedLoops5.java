package Class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            if (i == 1) {
                continue;
            }

            for (int j = 0; j < 5; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }}
