package Class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
void speak(){
    System.out.println("Animals can speak");
}
void eat(){
    System.out.println("All the animals eat");
    }
}
  class cat extends Animal{

void speak(){
    super.speak();
    System.out.println("Meow Meow......");
}
void printName(){
    System.out.println(name);
}
  }

class dog extends Animal{

}
class tester{

    public static void main(String[] args) {
        cat cat=new cat();
        cat.speak();
    }
}

