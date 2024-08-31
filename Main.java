//maximum and minimum element  in an array
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrayUtility.inputArray();
        int i=1;
        int min=arr[0];
        int max=arr[1];
        while(i<arr.length){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            i++;
            
        }
        System.out.println(min);
        System.out.println(max);
    }
    
}