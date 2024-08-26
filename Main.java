//Palindrome number
//If we reverse a digit and it agian became that number then it is called palindrom num
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        palindrom(num);
    }
    public static void palindrom(int num){
        int num1=num;
        int result=0;
        int i=0;
        while(num1!=0){
            i=num1%10;
            result=result*10+i;
            num1/=10;
        }
        if(result==num){
            System.out.println("The number is palindrom");
        }else{
            System.out.println("The result is not palindrom");
        }
    }
}