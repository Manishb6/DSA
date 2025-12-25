import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Merge two sorted arrays into one sorted array.
    
    int[] arr1={1, 3, 5, 7};
    int[] arr2={2, 4, 6, 8};
    int n1=arr1.length;
    int n2=arr2.length;
    int[] arr=new int[n1+n2]; 
    int n=arr.length;
    // Copy & Sort
    for(int i=0;i<n1;i++){
      arr[i]=arr1[i];
    }
    int j=0;
    for(int i=n1;i<n;i++){
      arr[i]=arr2[j];
      j++;
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    // Two pointer
    int i=0,j=0,k=0;
    while(i<n1&&j<n2){
      if(arr1[i]<arr2[j]){
        arr[k++]=arr1[i++];
      }
      else{
        arr[k++]=arr2[j++];
      }
    }
    while(j<n2){
      arr[k++]=arr2[j++];
    }
    while(i<n1){
      arr[k++]=arr1[i++];
    }
    for(int ele:arr){
      System.out.print(ele+" ");
    }
    
  }
}
