import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.Math;
import java.lang.StringBuilder;

public class No2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        bw.write(String.valueOf(Math.max(A, B)));
        bw.flush();
        bw.close();
    }
}