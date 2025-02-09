import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long total = 0;
        long input = Long.parseLong(br.readLine());

        for (int i = 0; i < input; i++) {
            String operation = br.readLine();
            if (operation.charAt(1) == '+') {
                total++;
            } else {
                total--;
            }
        }
        pw.println(total);
        pw.close();
    }
}
