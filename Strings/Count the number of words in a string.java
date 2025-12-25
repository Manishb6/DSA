import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Count the number of words in a string.
    
    String s="hello world from java";
    int n=s.length();
    int words=1;
    for(int i=0;i<n;i++){
      if(s.charAt(i)==' '){
        words++;
      }
    }
    System.out.println(words);
  }
}
