import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2444_V2{
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();

      int input = Integer.parseInt(br.readLine());
      int cnt = 0;
      for(int i = 0; cnt < input*2-1;){

        if(input>cnt){
          i++;
          for(int j = 0; j<input-i; j++){
            sb.append(" ");
          }
          for(int j = 0; j<2*i-1; j++){
            sb.append("*");
          }            
          sb.append("\n");

          cnt++;
        }

        else{
          if(i>=cnt)
            i-=1;

          for(int j = 0; j<input-i; j++){
            sb.append(" ");
          }
          for(int j = 0; j<2*i-1; j++){
            sb.append("*");
          }            
          sb.append("\n");
          i--;
          cnt++;
        }
      
      }
      bw.write(sb.toString());
      bw.flush();
    }
}