package Class19;

public class BankTest {
    public static void main(String[] args) {

        System.out.println("---Creating an Object for Bankaccount -------");

       BankAccount ba=new BankAccount();
       ba.accountNumber=2633424;
       ba.money=1000;
       ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        //ba.transfer(); methods defined inside child class not avialable to the parent classs


        System.out.println("---Creating an Object for checking-------");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=653762;
        check.money=2000;
        //features from checking class itself
        check.interest=0;

        System.out.println(check.accountNumber);
        System.out.println(check.interest);
        System.out.println(check.money);

        check.deposit();//from parent
        check.Transfer();//from child


        System.out.println("---Creating an Object for savings-------");

        Saving save=new Saving();
         save.accountNumber=3923492;
         save.money=3000;
         save.profit=100;
         //save.interset=0; siblings features not available

        save.deposit();//from parent
        save.takeProfit();//comes from savings
        //save.transfer();//not available

        System.out.println(save.accountNumber);
        System.out.println(save.money);
        System.out.println(save.profit);


        //finish creating SuperSavings object and see which feature available to that class
    }
}
