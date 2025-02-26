import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int iter = Integer.parseInt(br.readLine());
        long[] nums = new long[iter];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < iter; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iter; i++) {
            sb.append(nums[i]).append(' ');
        }
        pw.println(sb);
        pw.close();
    }
}