import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] result = br.readLine().trim().split(" ");

        if(result[0].equals(""))
          bw.write(0+"");
        else
          bw.write(String.valueOf(result.length));
        bw.flush();
        bw.close();
    }
}