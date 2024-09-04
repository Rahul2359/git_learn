//Merge two sorted array 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("For first array");;
        int []arr1=ArrayUtility.inputArray();
        System.out.println("For second array");
        int []arr2=ArrayUtility.inputArray();
        int[] newArray=newArray(arr1, arr2);
        System.out.println("The merge array is:");
        ArrayUtility.display_arr(newArray);
   }
   public static int[] newArray(int[] arr1,int []arr2){
        int i=0,k=0,j=0;
        int size=arr1.length + arr2.length;
        int [] newArray=new int[size];
        while(i<arr1.length||j<arr2.length){
            if(j==arr2.length||(i<arr1.length && arr1[i]<arr2[j])){
                newArray[k]=arr1[i];
                k++;
                i++;
            }
            else{
                newArray[k]=arr2[j];
                j++;
                k++;
            }
             
        }
        return newArray;
   }
}