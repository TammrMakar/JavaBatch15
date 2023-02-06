package Class19;

public class Student1 {


    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

    String name;
    String address;


    Student1(String name,String address){
        this.name=name;
        this.address=address;

    }

    void print(){
        System.out.println("the name of student"+name+"and his address is "+address);
    }
    public static void main(String[] args) {
        Student1 tamer=new Student1("tamer","8950 junco ct");




    }

}
