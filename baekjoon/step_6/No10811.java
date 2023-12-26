import java.io.*;
import java.util.*;

public class No10811 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[] arr = new int[100];
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      for (int i = 0; i < N; i++) {
        arr[i] = i;
      }
      for(int k = 0; k<M; k++){
        
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[]copy = Arrays.copyOfRange(arr, i, j);
        
        for(int l=0; l<copy.length; i++){
          arr[i+(j-1)] = copy[copy.length-(i+1)];
        }
      }
      
      for(int i = 0; i < N; i++){
        System.out.print(arr[i]+" ");
      }

    }
}