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
        long greatestNum = Integer.MIN_VALUE;
        long greatLocate = 0;
        long smallestLocate = 0;
        long smallestNum = Integer.MAX_VALUE;

        if (iter == 1) {
            pw.println(0);
            pw.close();
        }
        StringTokenizer input = new StringTokenizer(br.readLine());
        for (int i = 0; i < iter; i++) {
            long number = Long.parseLong(input.nextToken());
            if (greatestNum < number) {
                greatestNum = number;
                greatLocate = i;
            }
            if (smallestNum >= number) {
                smallestNum = number;
                smallestLocate = i;
            }
        }

        if (greatLocate > smallestLocate) {
            smallestLocate++;
        }

        long movements = (iter - smallestLocate - 1) + greatLocate;
        pw.println(movements);
        pw.close();
    }
}