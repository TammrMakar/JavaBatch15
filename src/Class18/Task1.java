package Class18;

public class Task1 {

    //3)	Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and
    // create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package and observe result.

   private Task1(){
        System.out.println("Constructors with a string as parameter");
    }

    Task1(String name){
        System.out.println("Constructors with a string as parameter");
    }
    protected Task1(int number){
        System.out.println("Constructors with a string as parameter");
    }

   public Task1(char c ){
       System.out.println("Constructors with a string as parameter");
   }

    public static void main(String[] args) {
            Task1 task1=new Task1();
            Task1 task2=new Task1("Java");
            Task1 task3=new Task1(1000);
            Task1 task4=new Task1('G');
        }

    }

