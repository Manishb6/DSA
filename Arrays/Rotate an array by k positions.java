import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      
      // Rotate an array by k positions.
      
      int[] arr={1, 2, 3, 4, 5};
      int k=2;
      int n=arr.length;
      k=k%n;
      // NOT RECOMENDED FOR INTERVIEW
      // for(int i=n-k;i<n;i++){
      //   System.out.print(arr[i]+" ");
      // }
      // for(int i=0;i<n-k;i++){
      //   System.out.print(arr[i]+" ");
      // }
    rev(arr,n,0,n-1);
    rev(arr,n,0,k-1);
    rev(arr,n,k,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  static int[] rev(int[] arr,int n,int left,int right){
    while(left<right){
      int temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
      left++;
      right--;
    }
    return arr;
  }
} 
