import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] numbers = input.split("");

        for(int i = 0; i < N; i++){
          sum += Integer.parseInt(numbers[i]);
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}