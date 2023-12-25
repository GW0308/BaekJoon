// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class No2525 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    int hours = sc.nextInt();
    int minutes = sc.nextInt();
    int times = sc.nextInt();

    if (times >= 60) {
        hours += times / 60;
        minutes += times % 60;
    }
      else{
        minutes+=times;
      }
      
      if (minutes >= 60) {
        hours += minutes/60;
        minutes = minutes%60;
      }
      if (hours >= 24) {
        hours -= 24;
      }
      

      System.out.println(hours + " " + minutes);
  }

}