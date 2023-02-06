package Class17;

public class Student {


     /*
  Create a class call it student defined 4 instance fields like name,age,weight,id
  create 5 objects of this class do this task without constructors and with constructors
   */

    String name;
    String id;
    int age;
    double weight;


   public Student(String studentName, String studentId, int studentAge, double studentWeight) {
        name = studentName;
        age = studentAge;
        id   =studentId;
        weight = studentWeight;
    }
          void printInfo() {
              if (weight == 0) {
                  System.out.println("name " + name + " Id " + id + " age " + age);
              } else {
                  System.out.println("name " + name + " Id " + id + " age " + age + " weight " + weight);
              }
          }

    public static void main(String[] args){
                  Student tamer = new Student("tamer", "adadas", 38, 230);
                  tamer.printInfo();
              }}


