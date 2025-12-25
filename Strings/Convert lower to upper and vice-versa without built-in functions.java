import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Convert lowercase letters to uppercase (without using built-in functions).
    
    String s="helLo";
    int n=s.length();
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++){
      int ch=s.charAt(i);
      if(ch<97){
        s1.append((char)(s.charAt(i)+32));
      }
      else
      s1.append((char)(s.charAt(i)-32));
    }
    // int x='A';
    // int x1='a';
    // System.out.println(x+" "+x1);
    System.out.println(s1);
  }
}
