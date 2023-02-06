package Class19;

public class Teacher {

    String name;
    int teacherId;
    String subject;

    Teacher(String name,int teacherId){
        this.name=name;//way1
        this.teacherId=teacherId;

    }
    Teacher(String name,int teacherId,String subject){
        this(name, teacherId);//way2
        this.name=subject;


    }
}
