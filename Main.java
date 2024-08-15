// sum of all odd number 1-Specific
import java.lang.Thread.State;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        sum_of_odd(num);
    }
    public static void sum_of_odd(int num){
        int i=1;
        int sum_of_odd=0;
        while(i<=num){
            if(i%2!=0){
                sum_of_odd=sum_of_odd+i;    
            }
            i++;
        }
        System.out.println(sum_of_odd);

    }
}