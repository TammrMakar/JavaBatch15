package Class24;

import Class23.FinalKeyword;

public class FinalDemo {
    public static void main(String[] args) {

        final int num;// we have created a constant variable
         num=20;
         //num=30; not

    }

    void NoOneShouldOverrideIt(){
        System.out.println("this method should never be overridden otherwise it might break the code base");
    }
}

class Nelson extends FinalDemo {

   /* void NoOneShouldOverrideIt(){// cant override this method as it declared as final
        System.out.println("let me do that");
    }*/

}
