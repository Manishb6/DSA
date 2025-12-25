import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Reverse Words in a String.
    
    String s="the sky is blue";
    String[] words = s.split(" ");
    for(int i=words.length-1;i>=0;i--){
      System.out.print(words[i]);
      if(i>0){
        System.out.print(" ");
      }
    }
  }
}
