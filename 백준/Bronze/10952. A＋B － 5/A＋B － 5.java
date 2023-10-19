import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            while (A != 0 && B != 0) {
                st = new StringTokenizer(br.readLine());
                bw.write((A + B) + "\n");
                A = Integer.parseInt(st.nextToken());
                B = Integer.parseInt(st.nextToken());
            }
            bw.flush();
            bw.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}