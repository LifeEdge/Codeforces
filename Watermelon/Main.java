import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(System.out);

        long nums = Long.parseLong(r.readLine());
        if (nums == 2) {
            pw.println("NO");
        } else if ((nums | 1) > nums) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }

        pw.close();
    }
}