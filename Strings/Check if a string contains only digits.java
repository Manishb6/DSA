import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Check if a string contains only digits.
    
    String s="12s345";
    int n=s.length();
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++){
      if(!Character.isDigit(s.charAt(i))){
        System.out.println("false");
        return;
      }
    }
    System.out.println("true");
  }
}
