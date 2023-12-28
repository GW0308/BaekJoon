import java.io.*;
import java.util.*;
import java.lang.Math;
public class No1546 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double[] test = new double[sc.nextInt()];
      int M = -1;
      double sum = 0.0;
      for(int i = 0; i < test.length; i++){
        test[i] =  sc.nextFloat();
        if(test[i] > M)
          M = (int)test[i];
      }
      for(int i = 0; i < test.length; i++){
        sum += (test[i]/M*100);
      }
      System.out.print(sum/test.length);
    }
}