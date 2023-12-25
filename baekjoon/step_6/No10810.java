import java.util.Scanner;

public class No10810 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int N[] = new int[sc.nextInt()];
      int M = sc.nextInt();
      int i, j, k;

      for(int a=0; a<M; a++){
         i = sc.nextInt();
         j = sc.nextInt();
         k = sc.nextInt();

        for(int b=i-1; b<j; b++){
          N[b] = k;
        }
      }

      String result = "";
      for(int a=0; a<N.length; a++){
        result += N[a]+" ";
      }
      System.out.print(result);
    }
}