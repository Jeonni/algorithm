import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int x = 0;
        StringTokenizer st;

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A>0 && B<10) {
                bw.write("Case #" + (x + 1) + ": " + A + " + " + B + " = " + (A + B) + "\n");
            }
            else{
                bw.write("range error");
            }
            x++;
        }
        bw.flush();
        bw.close();
    }
}