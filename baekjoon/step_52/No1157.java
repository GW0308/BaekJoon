import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.StringBuilder;
public class No1157 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int[] count = new int[26];
      char[] input = br.readLine().toUpperCase().toCharArray();
      char max = ' ';
      for (int i = 0; i < input.length; i++) {
        count[(int)(input[i]-65)] += 1;
        System.out.println(count[i]);
      }

      for (int i = 0; i < count.length; i++) {
        if(count[i]>count[i+1]){
          max = (char)(i+65);        
        }
      }
      System.out.println(1234);
    }
}