package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class D2Arrays {
    public static void main(String[] args) {
     // a 2D array which can hold 3 one D arrays
        // each of size 3

        String[][] thomsontrain=new String[3][3];
        String[] cabin0={"Adam","zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","zahra"};

        thomsontrain[0]=cabin0;
        thomsontrain[1]=cabin1;
        thomsontrain[2]=cabin2;

        // in the first [] we specify the address of 1 D ARRAY
        //in the second [] we specify the address of 2 D ARRAY
        System.out.println(thomsontrain[1][1]);
        System.out.println(Arrays.toString(thomsontrain[0]));

    }
}

    
