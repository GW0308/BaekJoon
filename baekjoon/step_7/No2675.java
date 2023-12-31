import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int T = Integer.parseInt(br.readLine());//테스트 케이스 개수
      
      for(int i = 0; i < T; i++){
        String[] strArr = br.readLine().split(" ");
        int R = Integer.parseInt(strArr[0]);//반복 횟수
        String S = strArr[1];//문자열

        for(int j = 0; j < S.length(); j++){
          for(int k = 0; k < R; k++){
            bw.write(S.charAt(j));
          }
        }
        bw.newLine();
      }
      
      bw.flush();
      bw.close();
    }
}