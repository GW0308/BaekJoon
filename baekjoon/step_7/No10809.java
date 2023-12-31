import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

//아스키 코드 a: 97, '0'=  48
public class No10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] S = new char[26];
        int[] intArr = new int[26];
        for(int i = 0; i < S.length; i++){
          S[i] = (char)(97+i);
        }

        for(int i = 0; i < input.length(); i++){
          for(int j = 0; j < S.length; j++){
            if(input.charAt(i) == S[j]){            
              S[j] = (char)(i+48);
              break;
            }
          }
        }

        for(int i = 0; i < intArr.length; i++){
          if(S[i]>=97)
            intArr[i] = -1;
          else
            intArr[i] = S[i]-48;
        }

        for(int i : intArr){
          bw.write(i+ " ");
        }
        
        bw.flush();
        bw.close();
    }
}