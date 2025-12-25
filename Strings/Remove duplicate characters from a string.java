import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Remove duplicate characters from a string.
    
    String s="programming";
    int n=s.length();
    HashSet<Character> hs=new LinkedHashSet<>();
    for(char ch:s.toCharArray()){
      hs.add(ch);
    }
    for(char ch:hs){
      System.out.print(ch+" ");
    }
  }
}
