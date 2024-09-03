import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=ArrayUtility.inputArray();
        System.out.println("The reverse array is ");
        int[] newArray=reverse_array(arr);
        ArrayUtility.display_arr(newArray);
    }
   public static int[] reverse_array(int arr[]){
    int size=arr.length;
    int [] reverse_array=new int[size];
    int i=0;
    while(i<arr.length){
        reverse_array[i]=arr[size-i-1];
        i++;
    }


    return reverse_array;
   }
}