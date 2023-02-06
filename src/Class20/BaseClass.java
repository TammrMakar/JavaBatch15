package Class20;

public class BaseClass {

    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");

    }
}
class Child extends BaseClass{

    String name="Jane";

    void callMe(){
        System.out.println(this.name);//jane
        System.out.println(super.name);//john
    }
    void hello(){
        System.out.println("Hello methods from child class");
    }
    void callingParentMethod(){
        hello();
        super.hello();
    }
}