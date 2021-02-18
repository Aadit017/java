/*package practicalPrc;
import java.util.*;
public class sort {
    public int []array;
    public int typeOfSorting;
    public int toFind;
    sort(int []array , int typeOfSorting,int toFind){
        this.array=array;
        this.typeOfSorting=typeOfSorting;
        this.toFind=toFind;
    }
    public static void main(String args[]){
        input();
    }
    static void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("1:bubble \t 2:selection");
        int choice=sc.nextInt();
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            int n =sc.nextInt();
            arr[i]=n;
        }
        System.out.println("\nenter number to be found ");
        int toBeFound=sc.nextInt();
        sort client =new sort(arr,choice,toBeFound);
        bubble(client.array,client.toFind);
    }
    static void bubble(int []arr,int n){
        int low , mid , high;
        high=arr.length-1;
        low=0;
        boolean cond=false;
        for(int i=0;i<high;i++){
                mid=(low+high)/2;
                if(arr[mid]==n){
                    System.out.println("found at "+mid);
                    cond=true;
                    break;
                }
                if(n>arr[mid]){
                    low=mid;
                }
                if(n<arr[mid]){
                    high=mid;
                }
            }
            if(cond==false) System.out.println("not in the array");
        }
}
*/