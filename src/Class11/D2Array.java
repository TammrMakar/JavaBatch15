package Class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        int[][] matrix={{10,20,30},
                        {40,50,60},
                        {30,40,20,10,25}
        };
        System.out.println(matrix[2][4]);

        System.out.println(Arrays.toString(matrix[0]));

        for (int i = 0; i < matrix[0].length ; i++) {
            System.out.println(matrix[1][i]);
        }
        int[]arr=matrix[1];// getting complete first array from 2D array
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
