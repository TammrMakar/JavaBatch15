package Class19;

import javax.imageio.stream.ImageInputStream;

public class ConstructorChain {



    ConstructorChain() {//this without argument
        System.out.println("I am non argument constructor");
    }

        ConstructorChain(String str){//this with argument
        this();//making a call to non argument constructor
                //this() => always must be on the first line
            System.out.println(str);
        }

        ConstructorChain(String str ,int number){
        this(str);
            System.out.println("This is constructor with int parameter "+number);
        }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain("hello",20);
        System.out.println("------End of the code--------");
    }
    }

