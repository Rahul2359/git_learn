// fibonacci series
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        fibonacci(num);

        }
        public static void fibonacci(int num){
            int num1=0;
            int num2=1;
            int num3=0;
            int i=1;
            System.out.print(num1+","+num2);
            while(i<num){
                num3=num1+num2;
                num1=num2;
                num2=num3;
                System.out.print(","+num2);
                i++;
            }
        }

    }