import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int numberOfMoves = (int) Math.pow(2, n) - 1;
        sb.append(numberOfMoves).append("\n");
        hanoi(n, 1, 2, 3);
        bw.write(sb.toString());

        br.close();
        bw.close();
    }

    public static void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        hanoi(n - 1, start, end, mid);
        sb.append(start).append(" ").append(end).append("\n");
        hanoi(n - 1, mid, start, end);
    }
}