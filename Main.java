//sum and avg of an array
import java.util.*;
class Main{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
        int arr[]=new int[5];
        int i=0;
        while(i<5){
            arr[i]=sc.nextInt();
            i++;
        }
      int j=0;
      int sum=0;
      int avg=0;
      while(j<5){
        sum=sum+arr[j];
        j++;
      } 
      avg=sum/arr.length;
      System.out.println(sum); 
      System.out.println(avg);

    } 
}