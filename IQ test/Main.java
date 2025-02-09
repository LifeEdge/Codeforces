import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long iter = Long.parseLong(br.readLine());

        String ins = br.readLine();
        String[] in = ins.split(" ");

        boolean prev = false;

        int i = 1;
        while (true) {
            long num = Long.parseLong(in[i - 1]);

            boolean status = (num | 1) > num;
            if (i != iter && i != 1) {
                boolean next = (Long.parseLong(in[i]) | 1) > Long.parseLong(in[i]);

                if (status != prev && status != next) {
                    pw.println(i);
                    break;
                } else if (status == prev && status != next) {
                    pw.println(i + 1);
                    break;
                } else if (status != prev && status == next) {
                    pw.println(i - 1);
                    break;
                }
            } else if (i == iter) {
                pw.println(i);
                break;
            }
            prev = status;
            i++;
        }
        pw.close();
    }
}