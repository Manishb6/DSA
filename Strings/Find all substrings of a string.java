import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Find all substrings of a string.
    
    String s="abcd";
    int n=s.length();
    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
        for(int k=i;k<=j;k++){
          System.out.print(s.charAt(k));
        }
        System.out.println();
      }
    }
  }
}
