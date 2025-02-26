import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static String isPrime(long n) {
        if (n <= 1) {
            return "NO";
        }
        if ((n & 1) != 1) {
            return "NO";
        }
        for (int i = 3; i <= (long) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long iter = Long.parseLong(br.readLine());

        String ins = br.readLine();
        String[] in = ins.split(" ");

        for (int i = 0; i < iter; i++) {
            long tempnum = Long.parseLong(in[i]);
            long num = (long) (Math.sqrt(tempnum));
            if (num * num != tempnum) {
                pw.println("NO");
            } else if (num == 2) {
                pw.println("YES");
            } else {
                pw.println(isPrime(num));
            }
        }
        pw.close();
    }
}