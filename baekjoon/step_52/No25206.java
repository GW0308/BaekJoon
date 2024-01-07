import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class No25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double sum = 0.0;
        double gradeSum = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                switch (grade) {
                    case "A+":
                        sum += 4.5 * score;
                        break;
                    case "A0":
                        sum += 4.0 * score;
                        break;
                    case "B+":
                        sum += 3.5 * score;
                        break;
                    case "B0":
                        sum += 3.0 * score;
                        break;
                    case "C+":
                        sum += 2.5 * score;
                        break;
                    case "C0":
                        sum += 2.0 * score;
                        break;
                    case "D+":
                        sum += 1.5 * score;
                        break;
                    case "D0":
                        sum += 1.0 * score;
                        break;
                }
                gradeSum += score;
            }
        }

        if (Double.isFinite(sum / gradeSum)) {
            bw.write(String.format("%.6f", sum / gradeSum));
        } else {
            bw.write("0.000000");
        }

        bw.flush();
    }
}
