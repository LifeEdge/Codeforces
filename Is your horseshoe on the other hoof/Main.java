import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        HashSet<Long> nums = new HashSet<Long>();

        String ins = br.readLine();
        String[] in = ins.split(" ");

        for (int i = 0; i < in.length; i++) {
            nums.add(Long.parseLong(in[i]));
        }

        pw.println(4 - nums.size());
        pw.close();
    }
}