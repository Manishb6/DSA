import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Check if two strings are anagrams.
    
    String s1="listen";
    String s2="silent";
    int n1=s1.length();
    int n2=s2.length();
    int[] freq1=new int[26];
    int[] freq2=new int[26];
    for(int i=0;i<n1;i++){
      freq1[s1.charAt(i)-'a']++;
    }
    for(char ch:s2.toCharArray()){
      freq2[ch-'a']++;
    }
    for(int i=0;i<26;i++){
      if(freq1[i]!=freq2[i]){
        System.out.println("false");
        return;
      }
    }
    System.out.println("true");
  }
}
