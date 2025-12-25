import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Find the frequency of each character in a string.
    
    String s="hello";
    int n=s.length();
    int[] freq=new int[26];
    for(int i=0;i<n;i++){
      freq[s.charAt(i)-'a']++;
    }
    // for(char ch:s.toCharArray()){
    //   freq[ch-'a']++;
    // }
    for(int i=0;i<26;i++){
      if(freq[i]>=1){
        System.out.println((char)(i+'a')+" "+freq[i]);
      }
    }
  }
}
