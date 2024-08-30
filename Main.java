//Loop paterns
import java.util.*;
class Main{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int[][] arr1=new int[5][5];
        int [] arr2={1,2,3,4,5};
        int [][] arr3={{1,2,3,4,5},{1,2,3,4},{3,5,3,6,2}};
        arr[1]=9;
        arr1[1][2]=9;
        int i=0;
        int j=0;
        
        while(i<arr2.length){
            System.out.println(arr2[i]);
            i++;
        }
        
        while (j<arr3.length) {
            int s=0;
            while(s<arr3[j].length){
                System.out.print(arr3[j][s]);
                s++;
            }
            j++;
            System.out.println();

            
        }

    } 
}