package Class20_1;
import Class20.Teacher;

public class SeleniumTeacher extends Teacher {
    public static void main(String[] args) {

        SeleniumTeacher selenium=new SeleniumTeacher();
        selenium.homework();//public
        selenium.grade();//protected available through the inheritance
        //selenium.scholarShip();//default not available
    }
}