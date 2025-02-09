import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        ArrayList<Character> ins = new ArrayList<Character>();

        long iter = Long.parseLong(br.readLine());

        long sum = 0;
        String word = br.readLine();

        if (iter < 26) {
            pw.println("NO");
            pw.close();
            return;
        }

        char[] input = word.toCharArray();

        for (int i = 0; i < iter; i++) {
            char lower = Character.toLowerCase(input[i]);
            if (!ins.contains(lower)) {
                ins.add(lower);
                sum += lower;
            }
        }

        if (sum == 2847) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.close();
    }
}