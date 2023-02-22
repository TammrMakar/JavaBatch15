package Class27;

public class Demo2 {
    public static void main(String[] args) {

        String name = "Nima";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        System.out.println(contains(name,names));
        //create a method which can search a name from this array return type if name is present in the array
        String[]arr=new String[2];
        names[4]="SHan";
    }


       public static boolean contains(String nameToBeSearched,String []names){

        for (String name:names) {
            if (nameToBeSearched.equals(name)) {
                return true;
            }
            }
           return false;
        }}

