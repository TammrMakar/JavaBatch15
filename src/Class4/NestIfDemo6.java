package Class4;

public class NestIfDemo6 {
    public static void main(String[] args) {

        int money = 1000;
        String day = "sunday";
        boolean mood = true;

        if (money > 700) {

            if (mood) {
                System.out.println("Lets go shipping");
            } else {
                System.out.println("Lets first save some money");
            }

        }


    }
}
