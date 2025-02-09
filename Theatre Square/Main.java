import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String input = br.readLine();
        String[] inputs = input.split(" ");
        long flagstones = Long.parseLong(inputs[2]);
        long length1 = Long.parseLong(inputs[0]);
        long length2 = Long.parseLong(inputs[1]);

        length1 = (length1 + flagstones - 1) / flagstones;
        length2 = (length2 + flagstones - 1) / flagstones;

        pw.println(length1 * length2);
        pw.close();
    }
}