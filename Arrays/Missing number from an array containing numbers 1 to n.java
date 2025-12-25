import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      
      // Find the missing number from an array containing numbers 1 to n.
      
      int[] arr={1, 2, 4, 5};
      int n=arr.length;
      n=n+1;
      int sum=0,sumnatnum=(n*(n+1))/2;
      for(int i=0;i<n-1;i++){
        sum+=arr[i];
      }
      int diff=sumnatnum-sum;
      System.out.println(diff);
    }
} 
