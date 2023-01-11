package Class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="fdgd";
        if(!password.equals("pass123")){
            System.out.println("Wrong password");
        }

        boolean israining=true;

        if(!israining){
            System.out.println("Lets go for a walk");
        }else{
            System.out.println("let take the umbrella");
        }
    }
}
