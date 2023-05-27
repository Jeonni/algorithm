import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[][] stars = new char[4 * n - 3][4 * n - 3];

        for (int i = 0; i < 4 * n - 3; i++) {
            Arrays.fill(stars[i], ' ');
        }

        fillStar(stars, n, 0, 0);

        for (char[] row : stars) {
            sb.append(new String(row)).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }

    public static void fillStar(char[][] stars, int n, int x, int y) {
        if (n == 1) {
            stars[y][x] = '*';
            return;
        }

        int length = 4 * n - 3;

        for (int i = 0; i < length; i++) {
            stars[y][x + i] = '*';
            stars[y + i][x] = '*';
            stars[y + length - 1][x + i] = '*';
            stars[y + i][x + length - 1] = '*';
        }

        fillStar(stars, n - 1, x + 2, y + 2);
    }
}