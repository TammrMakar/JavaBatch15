package Class21;

public class OverloadTask {

    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void method(String str1) {
        System.out.println("Method with one String");
    }

    static void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    static void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {
        method("Java");
        method("love","Java");
        method("I","Love","Java");

        OverloadTask.method("One");
        OverloadTask.method("One", "Two");
        OverloadTask.method("One", "Two", "Three");
    }


}
