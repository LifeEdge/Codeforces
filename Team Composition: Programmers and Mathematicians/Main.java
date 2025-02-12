import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long iter = Long.parseLong(br.readLine());

        for (int i = 0; i < iter; i++) {
            String input = br.readLine();
            String[] in = input.split(" ");

            long pro = Long.parseLong(in[0]);
            long math = Long.parseLong(in[1]);
            long max_groups = (pro + math) / 4;

            if (pro >= max_groups && math >= max_groups) {
                pw.println(max_groups);
            } else {
                pw.println(Math.min(pro, math));
            }
        }
        pw.close();
    }
}