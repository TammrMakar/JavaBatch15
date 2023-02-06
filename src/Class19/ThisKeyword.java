package Class19;

public class ThisKeyword {

    int a,b;//instance

    ThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }

      public void sum(int a ,int b){//local
          System.out.println("Sum of local variables = "+(a+b));
          System.out.println("Sum of instance variables = "+(this.a+this.b));//with this
      }

      void hello(){
          System.out.println("Hello batch 15");
      }
      void howAreYou(){
           System.out.println("How are you batch 15?");
      }
      void greetings(){
           hello();//this keyword refers to the current instance methods;
           howAreYou();
      }
    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10,20);
        System.out.println(obj.a);
        obj.sum(100,200);

        //----------------------------
        obj.greetings();
    }


}
