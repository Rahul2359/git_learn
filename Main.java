// factorial of a given number
import java.lang.Thread.State;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        factorial(num);
    }
    public static void factorial(int num){
        int fact=1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.println(fact);

    }
}