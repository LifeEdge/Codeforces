import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        double iter = Double.parseDouble(st.nextToken());
        double rad = Double.parseDouble(st.nextToken());
        double largest = 0.0;

        String input = br.readLine();

        String[] ins = input.split(" ");
        Arrays.sort(ins, Comparator.comparingDouble(Double::parseDouble));
        if (rad == Double.parseDouble(ins[0]) && iter == 1) {
            pw.println(rad);
            iter = 0;
        }
        for (int i = 0; i < iter; i++) {
            double num = Double.parseDouble(ins[i]);
            if (i == iter - 1 || (i == 0 && num != 0)) {
                if (i == 0) {
                    largest = num;
                }
                if (i == iter - 1) {
                    largest = Math.max(largest, rad - num);
                    pw.println(largest);
                }
            } else {
                largest = Math.max(largest, (Double.parseDouble(ins[i + 1]) - num) / 2.0);
            }
        }
        pw.close();
    }
}