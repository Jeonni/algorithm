import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String S = br.readLine();
            if (S == null || S.isEmpty()) break;
            sb.append(S).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
    }
}