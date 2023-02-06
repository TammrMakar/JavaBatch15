package Class19;

public class BankAccount {//parent class or super class

    long accountNumber;
    double money;


    void deposit() {
        System.out.println("Deposit methods from bank account class");
    }
}

   class Checking extends BankAccount {// child class or subclass or derived class

    double interest;

    void Transfer() {
        System.out.println("transfer methods from checking class");
    }
}

    class Saving extends BankAccount {

        double profit;

        void takeProfit(){
            System.out.println("Profit methods from checking class");

        }}

     class superSavings extends Saving{

    void superSavings(){
        System.out.println("Super saving methods from checking class");

    }


}

