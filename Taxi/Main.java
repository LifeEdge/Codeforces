import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long[] counts = new long[5];

        long iter = Long.parseLong(br.readLine());
        long taxis = 0;

        StringTokenizer in = new StringTokenizer(br.readLine());
        for (long i = 0; i < iter; i++) {
            int input = Integer.parseInt(in.nextToken());
            counts[input]++;
        }

        taxis = counts[4];

        taxis += counts[3];
        counts[1] = Math.max(0, counts[1] - counts[3]);

        taxis += counts[2] / 2;
        if (counts[2] % 2 == 1) {
            taxis += 1;
            counts[1] = Math.max(0, counts[1] - 2);
        }

        taxis += (counts[1] + 3) / 4;

        pw.println(taxis);
        pw.close();
    }
}
