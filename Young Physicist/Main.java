import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        long[] totals = new long[3];
        long iter = Long.parseLong(br.readLine());

        for (int i = 0; i < iter; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            totals[0] += Long.parseLong(st.nextToken());
            totals[1] += Long.parseLong(st.nextToken());
            totals[2] += Long.parseLong(st.nextToken());
        }

        if ((totals[0] == 0) && totals[1] == 0 && totals[2] == 0) {
            pw.println("YES");
            pw.close();
            return;
        }
        pw.println("NO");
        pw.close();
    }
}