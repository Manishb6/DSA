import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      
      // Find One Duplicate containing N + 1.
      
      int[] arr={3, 1, 3, 4, 2};
      int n=arr.length;
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=arr[i];
      }
      n=n-1;
      int sumnatnum=(n*(n+1))/2;
      int duplicate=sum-sumnatnum;
      System.out.println(duplicate);
    }
} 
