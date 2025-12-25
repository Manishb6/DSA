import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Remove all special characters from a string.
    
    String s="a@b#c$d%123";
    int n=s.length();
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++){
      if(Character.isLetterOrDigit(s.charAt(i))){
        s1.append(s.charAt(i));
      }
    }
    System.out.println(s1);
  }
}
