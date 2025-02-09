import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String input = br.readLine();
        char[] inputArr = input.toCharArray();
        Set<Character> vowels = new HashSet<>(Set.of('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'));
        for (char i : inputArr) {

            if (!vowels.contains(i)) {
                pw.print(".");
                pw.print(Character.toLowerCase(i));
            }
        }
        pw.close();

    }
}