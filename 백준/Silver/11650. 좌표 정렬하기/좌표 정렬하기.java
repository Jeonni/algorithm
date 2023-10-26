import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] arr = new int[N][2];
                
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            arr[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        Arrays.sort(arr, (e1, e2) -> {
            return e1[0] != e2[0] ? e1[0] - e2[0] : e1[1] - e2[1];
        });

        for(int i=0; i<N; i++){
            sb.append((arr[i][0] + " " + arr[i][1]) + "\n");
        }

        System.out.println(sb);
    }
}