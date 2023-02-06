package Replit;

public class Student {


    String name;
    String year;
    int batch;


    Student(String schoolName,String schoolYear,int schoolBatch) {
        name = schoolName;
        year = schoolYear;
        batch = schoolBatch;

    }

    void printInfo(){
        System.out.println("I am a student of batch "+batch+" studying at "+name+" in the year of "+year);


    }
}
