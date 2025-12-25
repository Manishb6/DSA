import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Find the maximum subarray sum.
    // Brute force
    int[] arr={-2, 1, -3, 4, -1, 2, 1, -5,};
    int n=arr.length;
    int max=Integer.MIN_VALUE,fi=-1,li=-1;
    for(int i=0;i<n;i++){
      int sum=0;
      for(int j=i;j<n;j++){
        sum+=arr[j];
        if(sum>max){
          max=sum;
          fi=i;
          li=j;
        }
      }
    }
    System.out.println(max);
    for(int i=fi;i<=li;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
