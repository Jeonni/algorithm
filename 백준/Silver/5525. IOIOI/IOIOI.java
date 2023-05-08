import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb.append("IO");
        }
        sb.append("I");
        String p = sb.toString(); // I,O 교대로 나오는 p

        int m = Integer.parseInt(br.readLine()); // s길이
        String s = br.readLine(); // 문자열 s

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (s.substring(i).startsWith(p)) {
                count++;
            }
        }
        System.out.println(count);
    }
}