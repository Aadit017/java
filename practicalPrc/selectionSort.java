package practicalPrc;
import java.util.*;
public class selectionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();
        System.out.println("now the array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){ 
            System.out.println("\t"+(i+1)+"postion ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){ 
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }   
            }
        }
        System.out.println("now the array");
        for(int i:arr){
            System.out.println(i);
        }    
    }
}
