import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      // Check if an array is sorted.
      int[] arr={3, 10, 12, 14, 14};
      int n=arr.length;
      for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
          System.out.println("False");
          return;
        }
      }
      System.out.println("True");
    }
}
