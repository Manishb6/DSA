import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Move all zeros to the end of the array.
    
    int[] arr={0, 1, 0, 3, 12};
    int n=arr.length;
    // without INPLACE
    int c=0;
    for(int i=0;i<n;i++){
      if(arr[i]==0){
        c++;
      }
      if(arr[i]!=0){
        System.out.print(arr[i]+" ");
      }
    }
    for(int i=0;i<c;i++){
      System.out.print(0+" ");
    }
    System.out.println();
    // INPLACE 
    int pos=0;
    for(int i=0;i<n;i++){
      if(arr[i]!=0){
        arr[pos]=arr[i];
        pos++;
      } 
    }
    for(int i=pos;i<n;i++){
      arr[i]=0;
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
