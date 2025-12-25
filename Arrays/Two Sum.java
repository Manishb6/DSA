import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    // Two Sum.
    int[] arr={1, 2, 3, 4, 5};
    int target=6;
    int n=arr.length;
    int fi=-1,li=-1;
    for(int i=0;i<n;i++){
      int find=target-arr[i];
      for(int j=i+1;j<n;j++){
        if(arr[j]==find){
          fi=i;
          li=j;
          break;
        }
      }
    }
    System.out.println(fi+" "+li);
  }
}
