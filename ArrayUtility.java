import java.util.*;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int i=0;
        while (i<size) {
            System.out.println("Enter the array element of index "+i);
            arr[i]=sc.nextInt();
            i++;
        }

        return arr;
    }
}
