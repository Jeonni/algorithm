import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int count = 2;

        while (N!=1) {
            if (N % count == 0) {
                sb.append(count).append('\n');
                N = N / count;
                count = 2;
            } else if (N % count != 0) {
                count ++;
            }
        }
        System.out.println(sb);
    }
}
