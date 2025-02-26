import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String input = br.readLine();

        if (input.contains("1111111") || input.contains("0000000")) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.close();
    }
}