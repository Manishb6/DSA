import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Replace spaces in a string with a given character.
    
    String s="hello world";
    char c='-';
    int n=s.length();
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++){
      if(s.charAt(i)==' '){
        s1.append(c);
      }
      else s1.append(s.charAt(i));
    }
    System.out.println(s1.toString());
  }
}
