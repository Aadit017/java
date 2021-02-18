package practicalPrc;
import java.util.*;
public class primeTillN {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int limit=sc.nextInt();
        for(int i=2;i<=limit;i++){
            if(check(i)==1){
                System.out.println(i);
            }
        }
        sc.close();
    }
    static int check(int n){ 
        for(int i=2;i<n;i++){
            if (n%i==0) return 0;
        }
    return 1;
    }
}
