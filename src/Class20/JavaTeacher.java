package Class20;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
      JavaTeacher java=  new JavaTeacher();

      java.teacherName="Asel";
      java.teacherId="a67";

        java.homework();//public
        java.grade();//protected
        java.scholarship();//default
        //java.extraPoint;//private members(variable and methods) DO NOT participate in the Inheritance

    }
}
