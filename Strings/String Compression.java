import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // String Compression.
    
    String s="abc";
    int n=s.length();
    int c=1;
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n-1;i++){
      if(s.charAt(i)==s.charAt(i+1)){
        c++;
      }
      else{
        s1.append(s.charAt(i));
        s1.append(c);
        c=1;
      }
    }
    s1.append(s.charAt(n-1));
    s1.append(c);
    System.out.print(s1);
  }
}
