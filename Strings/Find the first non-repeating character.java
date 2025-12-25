import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Find the first non-repeating character.
    
    String s="swiss";
    int n=s.length();
    int[] freq=new int[26];
    for(int i=0;i<n;i++){
      freq[s.charAt(i)-'a']++;
    }
    for(char ch:s.toCharArray()){
      if(freq[ch-'a']==1){
        System.out.print(ch);
        break;
      }
    }
  }
}
