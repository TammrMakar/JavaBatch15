package Class15;

public class MPractice3Tester {
    public static void main(String[] args) {

        //create the object of the class that has the method
        //objectname.methodname

        MPractice3 MP3=new MPractice3();
        int[] array={10,20,30};
        System.out.println(MP3.arraySum(array));

        System.out.println(MP3.arraySum(new int[]{10,10,10})); //another way
    }
    }




