import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long[] luckys = { 4, 7, 47, 74, 477, 474, 447 };
        long input = Long.parseLong(br.readLine());

        for (int i = 0; i < luckys.length; i++) {
            if (input % luckys[i] == 0) {
                pw.println("YES");
                pw.close();
                return;
            }
        }

        pw.println("NO");
        pw.close();
    }
}