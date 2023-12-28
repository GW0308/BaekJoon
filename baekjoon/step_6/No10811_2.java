import java.io.*;
import java.util.*;

public class No10811_2 {
    public static void main(String[] args){
      try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int[] arr = new int[100];
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      int temp;
      for (int i = 0; i < N; i++) {
        arr[i] = i+1;
      }
      for(int k = 0; k<M; k++){

        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());

        for(; i<=j; i++){
          temp = arr[i-1];
          arr[i-1] = arr[j-1];
          arr[j-1] = temp;
          j--;
        }
      }
      br.close();
        
      for(int i = 0; i < N; i++){
        System.out.print(arr[i]+" ");
      }
      }catch(Exception e){
      
      }
    
  }
}