package Class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.age=22;
        student.weight=70;
        student.schoolName="Snytax";

        Student student1=new Student();
        student1.name="Tamer";
        student1.id="456";
        student1.age=5;
        student1.weight=86;
        student1.schoolName="Snytax";

        Student student2=new Student();
        //student2.name="Peter";
        student2.id="789";
        student2.age=26;
        student2.weight=90;
        //student2.schoolName="Snytax";

        System.out.println(student2.name);
        System.out.println(student.schoolName);//another way that you might see a lot to access static variables
        System.out.println(student2.schoolName);
    }
}


