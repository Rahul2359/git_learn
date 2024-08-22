//Amstrong number
//If the sum of  cube of all the digit of a number is equal to that number then the number is called Amstrong number,like 153=1+125+27   370,371,407,1634

import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Amstrong(num);



    }
    public static int power(int base,int exponent){
        int result=1;
        while (exponent!=0) {
            result=result*base;
            exponent--;
        }
        return result;
    }


    public static int digit_num(int a){
        int i=0;
        while(a!=0){
            a=a/10;
            i++;
        }
        return i;
    }




    public static void Amstrong(int num1){
        double result=0;
        int num=num1;
        int digit=digit_num(num);
        while(num!=0){
            int digits=num%10;
            result=result+power(digits,digit);
            num=num/10;
        }
        if(result==num1){
            System.out.println("The number is a armstrong number");
        }else{
            System.out.println("the number is not a armstrong number");
        }

    }


}