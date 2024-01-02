import java.util.Scanner;

public class No2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int input = sc.nextInt();
      int cnt = 0;
      for(int i = 0; cnt < input*2-1;){
        
        if(input>cnt){
          i++;
          for(int j = 0; j<input-i; j++){
            System.out.print(" ");
          }
          for(int j = 0; j<2*i-1; j++){
            System.out.print("*");
          }            
          System.out.println();
          
          cnt++;
        }

        else{
          if(i>=cnt)
            i-=1;
          
          for(int j = 0; j<input-i; j++){
            System.out.print(" ");
          }
          for(int j = 0; j<2*i-1; j++){
            System.out.print("*");
          }            
          System.out.println();
          i--;
          cnt++;
        }
      
      }
    }
}