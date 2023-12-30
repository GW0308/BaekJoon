import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class No9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        String[] strArr = new String[input];
        char[] str = null;
        for(int i = 0; i < input; i++){
          strArr[i] = br.readLine();
        
        }
        for(int i = 0; i < input; i++){
          str = strArr[i].toCharArray();
          if(str.length < 2){
            bw.write(str[0]+""+str[0]+"\n");
          }
          else{
            bw.write(str[0]+""+str[str.length-1]+"\n");
          }
        }
          
        bw.flush();
        bw.close();
    }
}