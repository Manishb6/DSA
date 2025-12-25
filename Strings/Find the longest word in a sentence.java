import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Find the longest word in a sentence.
    
    String s="elephant cat dog";
    int n=s.length();
    int max=0,c=0;
    String s1="";
    int n1=s1.length();
    String fs="";
    for(int i=0;i<n;i++){
      if(s.charAt(i)!=' '){
        c++;
        s1+=(s.charAt(i));
        if(s1.length()>fs.length()){
          fs=s1;
        }
        if(c>max){
          max=c;
        }
      }
      else if(s.charAt(i)==' '){
        s1="";
        c=0;
      }
    }
    System.out.println(max+" "+fs);
  }
}
