import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Check if a string is a palindrome.
    
    String s="madam";
    int n=s.length();
    for(int i=0;i<n/2;i++){
      if(s.charAt(i)!=s.charAt(n-i-1)){
        System.out.print("false");
        return;
      }
    }
    System.out.print("true");
    
  }
}
