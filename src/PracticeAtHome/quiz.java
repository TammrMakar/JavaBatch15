package PracticeAtHome;

public class quiz {
    public static void main(String[] args) {

        int num;
        int arr[] = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        System.out.println("Given array elements:");
        for (int i=0; i<arr.length; i++ )
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n=======================");
        System.out.println("\nEven number of the array:");
        for (int i = 0;i<arr.length ;i++ )
        {
            if (arr[i]%2 == 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n==============");
        System.out.println("\nOdd number of the array:");
        for (int i = 0;i<arr.length ;i++ )
        {
            if (arr[i] % 2 != 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n==============");
    }
}