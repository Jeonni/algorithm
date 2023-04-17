import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // String이 리턴 값이기 때문에 형 변환이 필수적!
        int N = Integer.parseInt(br.readLine());

        if(N <= 100000 && N > 0){
            for(int i=1; i<=N; i++){
                bw.write(i + "\n");
            }
        }
        else{
            bw.write("range error\n");
        }
        bw.flush();
        bw.close();
    }
}