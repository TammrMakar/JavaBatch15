package Class16;

public class Person {

    private double bankBalance=1250000;

    String address="street 123";//default access level is applied
    String name="John Snow";


    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSnn(){
        System.out.println("123456789");
}
    public void printTikTokAccount(){
        System.out.println("user123");

    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSnn();
        person.printTikTokAccount();


    }
}
