import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer dp[] = new Integer[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 2xn 타일이 채워지는 경우의 수
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        StringBuilder sb = new StringBuilder();
        sb.append(cases(n)).append('\n');

        System.out.println(sb);
    }

    static Integer cases(int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[n];
    }
}
