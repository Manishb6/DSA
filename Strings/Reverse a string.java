import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Reverse a string.
    
    String s="hello";
    int n=s.length();
    for(int i=n-1;i>=0;i--){
      System.out.print(s.charAt(i));
    }
    
  }
}
