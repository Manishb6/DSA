import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Check if one string is a rotation of another.
    
    String s1="abcd";
    String s2="cdab";
    int n1=s1.length();
    int n2=s2.length();
    String s=s1+s1;
    if(s.contains(s2)){
      System.out.print("true");
    }
    else System.out.print("false");
  }
}
