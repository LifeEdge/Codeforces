import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String input = br.readLine();
        String sub = input.substring(1);

        if (input.toUpperCase().equals(input)) {
            pw.println(input.toLowerCase());
            pw.close();

        } else if (sub.toUpperCase().equals(sub) && input.charAt(0) > 96) {
            pw.print(input.substring(0, 1).toUpperCase() + sub.toLowerCase());
        } else {
            pw.println(input);
        }

        pw.close();
    }
}