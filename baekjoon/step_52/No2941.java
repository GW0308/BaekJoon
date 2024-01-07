import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class No2941 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] input = br.readLine().split("");
      int cnt = 0;
      for(int i = 0; i < input.length; i++){
        if(i!=input.length-1){
          if(input[i].equals("c") && input[i+1].equals("=")){
            input[i] = "č";
            input[i+1] = "";
            i++;
          }
          else if(input[i].equals("c") && input[i+1].equals("-")){
            input[i] = "ć";
            input[i+1] = "";
            i++;
          }

          else if(i+2 < input.length && (input[i].equals("d") && input[i+1].equals("z"))&&input[i+2].equals("=")){
              input[i] = "dž";
              input[i+1] = "";
              input[i+2] = "";
              i+=2;
            }
          
          
          else if(input[i].equals("d") && input[i+1].equals("-")){
            input[i] = "đ";
            input[i+1] = "";
            i++;
          }
          else if(input[i].equals("l") && input[i+1].equals("j")){
            input[i] = "lj";
            input[i+1] = "";  
            i++;
          }  
          else if(input[i].equals("n") && input[i+1].equals("j")){
            input[i] = "nj";
            input[i+1] = "";
            i++;
          }       
          else if(input[i].equals("s") && input[i+1].equals("=")){
            input[i] = "š";
            input[i+1] = "";
            i++;
          }          
          else if(input[i].equals("z") && input[i+1].equals("=")){
            input[i] = "ž";
            input[i+1] = "";
            i++;
          }
        }
          
        cnt++;
        }

      bw.write(String.valueOf(cnt));
      bw.flush();
    }
}