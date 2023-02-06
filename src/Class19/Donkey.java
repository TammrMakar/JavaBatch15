package Class19;

public class Donkey {

    String name;
    int age;
    double weight;

/*Donkey(){
    System.out.println("This is non argument constructor");
}*/

    Donkey(String donName,int donAge){
        this.name=donName;
        this.age=donAge;

    }
    void print(){
        System.out.println("Donkey's name is "+name+" age is "+age+" and weight is "+weight);
    }
}
