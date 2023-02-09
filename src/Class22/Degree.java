package Class22;

public class Degree {

    void getPrerequisite(){
        System.out.println("to get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    void getPrerequisite(){
        System.out.println("to get a masters degree you need a bachelors degree first");
    }
}
   class DegreeTester{
       public static void main(String[] args) {
           Degree de=new Degree();
           de.getPrerequisite();
           Bachelors bec=new Bachelors();
           bec.getPrerequisite();
           Masters mas=new Masters();
           mas.getPrerequisite();
       }
   }