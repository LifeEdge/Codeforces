import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long iter = Long.parseLong(br.readLine());
        int output = 0;
        for (int i = 0; i < iter; i++) {
            String line = br.readLine();

            String[] inputs = line.split(" ");
            long current = Long.parseLong(inputs[0]) + Long.parseLong(inputs[1]) + Long.parseLong(inputs[2]);
            if (current >= 2) {
                output++;
            }
        }
        System.out.println(output);
    }
}