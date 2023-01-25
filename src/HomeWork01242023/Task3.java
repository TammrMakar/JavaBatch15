package HomeWork01242023;

public class Task2 {
    public static void main(String[] args) {

//2) Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str = "sfgsjfgsdfSDFKHSDFIUHSDIF242354363@##$%#%)(";

        int totalCount=str.length();
        int loweCase;
        int UpperCase;
        int numbers;
        int specialChar;

        System.out.println(totalCount);
        System.out.println((str.replaceAll("[A-Z]", "#")));
        System.out.println((str.replaceAll("[a-z]", "#")));





    }

}

