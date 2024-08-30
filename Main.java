//number of occurance of a number in a array
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrayUtility.inputArray();
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=0;
        int size=0;
        while(i<arr.length){
            if(arr[i]==num){
                size++;
                
            }
            i++;
        }
        System.out.println("Number of occurance of "+num+"="+size);
    }
}