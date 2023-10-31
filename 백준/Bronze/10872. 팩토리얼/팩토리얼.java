import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1;

        if(N == 0){
            System.out.println(sum);
        } else if (N > 0 && N <= 12) {
            while (N-- > 0) {
                sum *= (N + 1);
            }
            System.out.println(sum);
        } else {
            System.out.println("Range Error");
        }
    }
}