import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer inSt = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(inSt.nextToken());
            int end = Integer.parseInt(inSt.nextToken());

            // 역순을 담을 배열
            ArrayList<Integer> reserveList = new ArrayList<>();
            for (int j = start - 1; j < end; j++) {
                reserveList.add(list[j]);
            }

            int index = 0;

            for (int j = end - 1; j >= start - 1; j--) {
                list[j] = reserveList.get(index);
                index++;
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        br.close();
    }
}