import java.util.Scanner;
import java.lang.StringBuilder;
public class No3003 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] input = sc.nextLine().split(" ");
      int[] origin = {1, 1, 2, 2, 2, 8};
      StringBuilder strbul = new StringBuilder();
      
      for(int i = 0; i < origin.length; i++){
        int intInput = Integer.parseInt(input[i]);

        if(intInput!=origin[i])
          strbul.append(origin[i] - intInput+" ");
        else
          strbul.append(0+" ");
      }
      System.out.print(strbul.toString());
    }
}