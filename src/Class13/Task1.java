package Class13;

public class StringRecap {
    public static void main(String[] args) {
        //How can i print all the letters from this String one by one

        String str="Java is great";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
        //what is the input to charAt()method its int out is a char
        //count how many times the letters

        String str1="Java is great";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str1.charAt(i) == 'a')
                count++;
        }
    }
            System.out.println("Letter a has appeared "+"many times");
    }
}