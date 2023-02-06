package Class17;

public class StudentTester {
    public static void main(String[] args) {

        //this way with without constructors and with constructors

        /*Student student1=new Student();
        student1.name="tamer";
        student1.id="32657273";
        student1.age=38;
        student1.weight=230;*/

        //this way with constructors

        Student tamer=new Student("tamer","adadas",38,230);
        tamer.printInfo();
        Student peter=new Student("peter","376283",34,185);
        peter.printInfo();
        Student marina=new Student("marina","qee2323",35,255);
        marina.printInfo();


        }}




