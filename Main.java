//The array is palindrome or not 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=ArrayUtility.inputArray();
        palindrome(arr);
        if(palindrome(arr)==true){
            System.out.println("The array is palindrome");
        }else{
            System.out.println("The array is not palindrome");
        }
    }
   public static boolean palindrome(int arr[]){
    int [] reverse_array=new int[arr.length];
    int i=0;
    while(i<arr.length){
        reverse_array[i]=arr[arr.length-i-1];
 
    i++;
   }
   int j=0;
   while(j<arr.length){
    if(reverse_array[j]!=arr[j]){
        return false;
    }
    j++;
   }
   return true;
   }
}