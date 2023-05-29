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
        } else {
            hanoi(n - 1, start, end, mid); // n-1개의 원판을 start 기둥에서 end 기둥을 거쳐 mid 기둥으로 옮기고,
            sb.append(start).append(" ").append(end).append("\n"); // sb에 이동을 기록
            hanoi(n - 1, mid, start, end); // 그 후 가장 큰 원판을 start 기둥에서 end 기둥으로 옮기고 다시 재귀적으로
        }
    }
}