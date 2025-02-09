import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long iter = Long.parseLong(br.readLine());

        for (int i = 0; i < iter; i++) {
            long moves = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            long its = Long.parseLong(st.nextToken());
            long ops = Long.parseLong(st.nextToken());
            String in = br.readLine();
            String[] ins = in.split("");

            for (int j = 0; j < its; j++) {
                if (ins[j].equals("B")) {
                    j += ops - 1;
                    moves++;
                }
            }
            pw.println(moves);
        }
        pw.close();
    }
}