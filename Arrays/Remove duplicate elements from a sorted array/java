import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      
      // Remove duplicate elements from a sorted array.
      
      int[] arr={1, 1, 3, 3, 4, 4, 5};
      int n=arr.length;
      int ue=1;
      for(int i=1;i<n;i++){
        if(arr[i]!=arr[i-1]){
          arr[ue++]=arr[i];
        }
      }
      for(int i=0;i<ue;i++){
        System.out.print(arr[i]+" ");
      }
    }
} 
