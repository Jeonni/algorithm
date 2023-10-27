import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        StringTokenizer st;
        int[] list;

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적 입력
            int N = Integer.parseInt(st.nextToken()); // 학생 수
            list = new int[N];

            double sum = 0; // 성적의 누적 합

            for (int j = 0; j < N; j++) { // 성적 입력 부분
                int val = Integer.parseInt(st.nextToken());
                list[j] = val;
                sum += val;
            }

            double avg = (sum/N);
            double count = 0;

            for (int j = 0; j < N; j++) {
                if(list[j]>avg){
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}