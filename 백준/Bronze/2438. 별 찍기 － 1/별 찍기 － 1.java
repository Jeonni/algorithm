import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        if(N >= 1 && N <= 100){
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        else{
            bw.write("range error\n");
        }

        bw.flush();
        bw.close();
    }
}