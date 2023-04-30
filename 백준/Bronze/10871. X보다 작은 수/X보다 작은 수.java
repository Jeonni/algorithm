import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");

            if (N >= 1 && X <= 10000) {
                for (int i = 0; i < N; i++) {
                    int value = Integer.parseInt(st.nextToken());
                    if (value < X) {
                        bw.write(value + " ");
                    }
                }
            }
            br.close();
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}