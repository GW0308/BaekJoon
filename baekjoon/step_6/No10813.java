import java.util.Scanner;
import java.util.Arrays;
public class No10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[sc.nextInt()];
        int M = sc.nextInt();
        int temp;
        String result = "";

      for(int n = 0; n<N.length; n++){
        N[n] = n+1;
      }
      for(int n = 0; n<M; n++){
        int i = sc.nextInt();
        int j = sc.nextInt();

        temp = N[i-1];
        N[i-1] = N[j-1];
        N[j-1] = temp;
      }
      for(int n = 0; n<N.length; n++){
        result += N[n]+" ";
      }
      System.out.print(result);
      
    }
}