import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        double iter = Double.parseDouble(br.readLine());
        String in = br.readLine();
        String[] inA = in.split(" ");
        double total = 0;
        for (int i = 0; i < iter; i++) {
            double num = Double.parseDouble(inA[i]);
            total += num;
        }
        pw.println(total / iter);
        pw.close();
    }
}