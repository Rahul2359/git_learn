// prime number program
import java.lang.Thread.State;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        primeno(num);
    }
    public static void primeno(int num){
        int i=2;
        int a=0;
        while(i<num){
            if(num%i==0){
             a++;   
            }
            i++;
        }
        if(a==0){
            System.out.println("the number is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
        }

    }