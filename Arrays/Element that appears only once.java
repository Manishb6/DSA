import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    
    // Find the element that appears only once (others appear twice).
    
    int[] arr={2, 2, 3, 5, 4, 5, 3};
    int n=arr.length;
    // USING HashMap
    HashMap<Integer, Integer> hm=new HashMap<>();
    for(int i=0;i<n;i++){
      if(hm.containsKey(arr[i])){
        hm.put(arr[i],hm.get(arr[i])+1);
      }
      else hm.put(arr[i],1);
    }
    for(Map.Entry<Integer, Integer> e:hm.entrySet()){
      if(e.getValue()==1){
        System.out.println(e.getKey());
      }
    }
    
    // USING XOR
    int temp=0;
    for(int i=0;i<n;i++){
      temp=temp^arr[i];
    }
    System.out.println(temp);
    
    // USING HashSet
    HashSet<Integer> hs=new HashSet<>();
    int ans=0;
    for(int i=0;i<n;i++){
      if(!hs.contains(arr[i])){
        hs.add(arr[i]);
      }
      else if(hs.contains(arr[i])){
        hs.remove(arr[i]);
      }
    }
    for(int ele:hs){
      System.out.println(ele);
    }
  }
}
