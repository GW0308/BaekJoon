import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;

public class No1157 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int[] count = new int[26];
      char[] input = br.readLine().toUpperCase().toCharArray();
      int max = -1;
      char maxChr = ' ';
      
      for (int i = 0; i < input.length; i++) {
        count[(int)(input[i])-65]++;
      }
      for (int i = 0; i < 26; i++) {
        if(count[i]>max){
          max = count[i];      
          maxChr = (char)(i+65);
        }
        else if(count[i]==max){
          maxChr = '?';
        }
          
      }
   

      if(input.length == 1) 
        bw.write(String.valueOf(input[0]));
      else
        bw.write(String.valueOf(maxChr));
     
      bw.flush();
    }
}