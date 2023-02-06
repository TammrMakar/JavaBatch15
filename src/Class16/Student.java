package Class16;

public class Student {


    String name;
    String id;
    String schoolName;
    int age;
    double weight;

    void printName() {

        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printNameInfo() {
        //System.out.println(name);can't access here
        // System.out.println(schoolName);


    }
}

