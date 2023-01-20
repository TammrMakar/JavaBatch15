package Class9;

public class ArrayDemo4 {
    public static void main(String[] args) {

     //create an array to store the letters A B c d e f

        char []letters={'A','B','C','D','E','F'};
        letters[0]='z';//update the element at index 0

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
}}


