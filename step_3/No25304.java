import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int totPay = sc.nextInt();
      int itemSec = sc.nextInt();
      int pay = 0;
      int amount = 0;
      int receipt = 0;
      
      for(int i=0; i<itemSec; i++){
        pay=sc.nextInt();
        amount=sc.nextInt();
        receipt+=pay*amount;
      }
      if(receipt==totPay)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}