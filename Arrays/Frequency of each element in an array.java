import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      
      // Find the frequency of each element in an array.
      
      int[] arr={1, 1, 3, 3, 4, 4, 5};
      int n=arr.length;
      HashMap<Integer, Integer> hm=new HashMap<>();
      for(int i=0;i<n;i++){
        if(hm.containsKey(arr[i])){
          hm.put(arr[i],hm.get(arr[i])+1);
        }
        else hm.put(arr[i],1);
      }
      for(Map.Entry<Integer, Integer> e : hm.entrySet()){
        System.out.println(e.getKey() + " -> " + e.getValue());
      }

      // if already array is sorted take largest=arr[n-1]; if not do arrays.sort
      // lets asume array is not sorted
      Arrays.sort(arr);
      int largest=arr[n-1];
      // System.out.println(largest);
      int[] freq=new int[largest+1];
      for(int i=0;i<n;i++){
        freq[arr[i]]++;
      }
      for(int i=0;i<freq.length;i++){
        System.out.println(i+" - "+freq[i]+" ");
      }
    }
} 
