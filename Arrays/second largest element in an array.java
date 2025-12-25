import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      // Find the second largest element in an array.
      int[] arr={14, 14, 10, 8, 3};
      int n=arr.length;
      int secondlargest=Integer.MIN_VALUE,largest=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(arr[i]>largest){
          secondlargest=largest;
          largest=arr[i];
        }
        else if(arr[i]>secondlargest&&arr[i]!=largest){
          secondlargest=arr[i];
        }
      }
      System.out.println(secondlargest+" "+largest);
    }
}
