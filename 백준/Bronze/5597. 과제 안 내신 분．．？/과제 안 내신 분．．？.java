import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isExsist = new boolean[31];

        for (int i = 0; i < 28; i++) {
            isExsist[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i < 31; i++) {
            if(!isExsist[i]) System.out.println(i);
        }
    }
}