import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Longest Substring Without Repeating Characters.
    
    String s="dvdf";
    int n=s.length();
    HashSet<Character> hs=new LinkedHashSet<>();
    int max=0,l=0;
    for(int r=0;r<n;r++){
      while(hs.contains(s.charAt(r))){
        hs.remove(s.charAt(l));
        l++;
      }
      hs.add(s.charAt(r));
      max=Math.max(max,r-l+1);
    }
    System.out.println(max);
  }
}
