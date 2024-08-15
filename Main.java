// lcm of a number
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(lcm(num1,num2));
    }
    public static int lcm(int num1,int num2){
        int i=1;
        int mul=1;
        while(i<=num2){
            mul=num1*i;
            if(mul%num2==0){
                return mul;
            }
            i++;
        }
        return 0; //unreachable
        }

    }