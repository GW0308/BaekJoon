import java.util.Scanner;
import java.util.Arrays;

public class No5597 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] n = new int[28];
      int[] numbers = {1,2,3,4,5,6,7,8,9,10
                      ,11,12,13,14,15,16,17,18,19
                      ,20,21,22,23,24,25,26,27,28,29,30};
      int[] a = new int[2];
      int b=0;
      
      for(int i = 0; i<n.length; i++){
        n[i] = sc.nextInt();
        numbers[n[i]-1] = 0;
      }

      for(int i = 0; i<numbers.length; i++){
        if(numbers[i]>0){
          a[b]=numbers[i];
          b++;
        }
      }

      for(int i = 0; i<b; i++){
        System.out.println(a[i]);
      }
    }
}