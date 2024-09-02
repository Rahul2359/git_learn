import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [] arr=ArrayUtility.inputArray();
    System.out.println("Enter the number you want to delete from the array");
    int num=sc.nextInt();
    int [] new_arr=delete_element(arr, num);
    ArrayUtility.display_arr(new_arr);


  }
  public static int occ(int []arr,int num){
    int i=0;
    int size=0;
    while(i<arr.length){
      if(arr[i]==num){
        size+=1;
      }
      i++;
    }
    return size;
  }
  public static int[] delete_element(int arr[],int num){
    int occ=occ(arr, num);
    if (occ==0) {
      return arr;
    }
    int newSize=arr.length-occ;
    int [] newArray=new int[newSize];
    int i=0;
    int j=0;
    while(i<newArray.length){
      if(arr[i]!=num){
        newArray[j]=arr[i];
        j++;
      }
      i++;
    }

    return newArray;
  }
}