package Class12;

public class StringDemo11 {
    public static void main(String[] args) {
      String str="Send it to support channel. more java";
      //returns the new String from this index
      String newstr=str.substring(28);
        System.out.println(newstr);
        //we can also specify the starting point and the ending point
        System.out.println(str.substring(0,27));



}
}
