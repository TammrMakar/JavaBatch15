package Class17;

public class Task3 {


/*    Create a method that will accept a String as a parameter
and return a new String that consist only of vowels//means from uppercase tolower case
Method should be available inside the class only
where it was declared and executed by calling it is name.*/

//return type=String
    //name=getOnlyVowels
    //parameters=String inputStr

    //Method should be available inside the class only that means PRIVATE.

private static String getOnlyVowels(String inputStr){
    return inputStr.replaceAll("[^AEIOUYaeiouy]","");


}
    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Java"));
    }

}
