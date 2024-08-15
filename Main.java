// gcd of a number
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(gcd(num1,num2));
    }
    public static int gcd(int num1,int num2){
        int i=2;
        int s=small(num1, num2);
        while(i<=s){
            if(num1%i==0 && num2%i==0){
                return i;
            }
            
            i++;
        }

        return 1;
        }
        public static int small(int num1,int num2){
            if(num1<num2){
                return num1;
            }
            else{
                return num2;
            }
        }

    }