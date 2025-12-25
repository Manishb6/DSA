import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Count vowels and consonants in a string.
    
    String s="hello";
    int n=s.length();
    String vowels="aeiou";
    int vow=0,con=0;
    for(int i=0;i<n;i++){
      if(vowels.indexOf((s.charAt(i)))!=-1){
        vow++;
      }
      else con++;
    }
    System.out.print(vow+" "+con);
    
  }
}
