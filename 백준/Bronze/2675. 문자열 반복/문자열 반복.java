import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");

            int R = Integer.parseInt(str[0]);
            
            for (byte value : str[1].getBytes()) {
                for (int j = 0; j < R; j++) {
                    sb.append((char) value);
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

}
