import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Implement Selection Sort.
    
    int[] arr={64, 25, 12, 22, 11};
    int n=arr.length;
    for(int i=0;i<n;i++){
      int idx=0;
      int min=Integer.MAX_VALUE;
      for(int j=i;j<n;j++){
        if(min>arr[j]){
          min=arr[j];
          idx=j;
        }
      }
      int temp=arr[i];
      arr[i]=min;
      arr[idx]=temp;
      
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    
  }
}
