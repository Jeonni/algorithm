import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double list[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < list.length; i++) {
            list[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(list); // 오름차순 정렬


        for (int i = 0; i < list.length; i++) {
            sum += list[i] / list[list.length - 1] * 100;
        }

        double result = 0;
        result = (sum / list.length);

        System.out.println(result);
    }
}