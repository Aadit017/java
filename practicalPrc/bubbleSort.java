package practicalPrc;
import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements for array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("\nnow the array");
        for(int i=0;i<n;i++){
            System.out.println(i+1+" position");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swapping the elements
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("now printing the array");
        for(int i :arr){
            System.out.println(i);
        }
    } 
} 