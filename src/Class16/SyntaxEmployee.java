package Class16;

public class SyntaxEmployee {

   //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empID;
    double Salary;
    static String ceo="sumir";//is going to be same we create this one as static


    public static void main(String[] args) {


        SyntaxEmployee se=new SyntaxEmployee();
        se.empID="234";
        se.Salary=1000000;

        SyntaxEmployee se1=new SyntaxEmployee();
        se1.empID="234";
        se1.Salary=1000000;
        System.out.println(se1.empID);
        System.out.println(se1.Salary);
        System.out.println(se1.ceo);
}}
