package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {


        int []array2={10,10,10,20,30};
      addArrayElementsmachine(array2);
        int[]array3={20,20,40,40};
      addArrayElementsmachine(array3);
    }
    static void addArrayElementsmachine(int []arr){

        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);
        }
    }

