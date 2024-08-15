// gcd of a number
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=sc.nextInt();
        System.out.println(reverse(num1));
    }
    public static int reverse(int num1){
        int digit=0;
        int reverse=0;
        while(num1!=0){
            digit=num1%10;
            reverse=reverse*10+digit;
            num1=num1/10;           
            
        }
        return reverse;

        }

    }