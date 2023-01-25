package Class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="Java is Love";
       char elena=str.charAt(2);
       System.out.println(elena);



        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));



            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)=='a'){
                    count++;
                }
            }
            System.out.println(count);
        }}}



