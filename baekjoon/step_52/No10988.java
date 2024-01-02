import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.IOException;
import java.lang.StringBuilder;
public class No10988{
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      String input = br.readLine();
      String reverse = new StringBuilder(input).reverse().toString();

      if(input.equals(reverse))
        bw.write(String.valueOf(1));
      else
        bw.write(String.valueOf(0));

      bw.flush();
    }
}