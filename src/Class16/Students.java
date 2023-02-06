package Class16;

public class Students {

    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String name;
    String Id;
    static int numberOfStudents;

    public static void main(String[] args){

        Students stu1=new Students();
        stu1.name="Tamer";
        stu1.Id="6354723";
        stu1.numberOfStudents++;

        Students stu2=new Students();
        stu2.name="Peter";
        stu2.Id="7892972";
        stu2.numberOfStudents++;


        System.out.println(Students.numberOfStudents);




    }}

