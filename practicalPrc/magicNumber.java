package practicalPrc;
import java.util.*;
public class magicNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int input=sc.nextInt();
        int cond =checkMagic(input);
        System.out.println("the value of the sum is "+cond);
    } 
    static int checkMagic(int n){
        int sum=0;
        sum=function(n);
        if(sum > 0 && sum < 10){
            return sum; 
        }else{
            return (function(sum) < 10) ? function(sum):0;
        }
    }
    static int function(int n){
        int tmp=0;
        while(n>0){
            tmp+=n%10;
            n=n/10;
        }
    return tmp;
    }
} 

