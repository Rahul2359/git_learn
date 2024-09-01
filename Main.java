import java.lang.reflect.Array;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=ArrayUtility.inputArray();
        if(asc(arr)==true){
            System.out.println("the array is sorting in ascending order");
        }
        else if(desc(arr)==true){
            System.out.println("The array is sorting in descending order");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
    public static boolean asc(int[] arr){
        int i=0;
        while(i<arr.length-1){
            if(arr[i+1]<arr[i]){
                return false;
            }
            i++;
        }
        return true;

    } 
    public static boolean desc(int[] arr){
        int i=0;
        while(i<arr.length-1){
            if(arr[i+1]>arr[i]){
                return false;
            }
            i++;
        }
        return true;

    } 
    

}