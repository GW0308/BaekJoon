import java.util.Scanner;
import java.util.Arrays;

public class No3052 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    
      int nums[] = new int[10];
      int result = 0;
      int cnt;
      
      for(int i = 0; i < nums.length; i++){
        nums[i] = sc.nextInt() % 42;
      }
      
      for(int i = 0; i < nums.length; i++){
        cnt = 0;
        for(int j = i+1; j < nums.length; j++){
          if(nums[i]==nums[j]){
            cnt++;
            break;
          }
        }
        
        if(cnt==0)
          result++;
      }
      
      System.out.print(result);
    }
}