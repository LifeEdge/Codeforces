import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long iter = Long.parseLong(br.readLine());

        for (int i = 0; i < iter; i++) {
            String ins = br.readLine();

            if (ins.length() > 10) {
                pw.println(ins.substring(0, 1) + (ins.length() - 2) + ins.substring(ins.length() - 1));
            } else {
                pw.println(ins);
            }
        }
        pw.close();
    }
}