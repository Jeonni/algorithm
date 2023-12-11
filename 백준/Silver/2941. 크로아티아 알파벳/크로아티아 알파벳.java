import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String see : alphabets){
            str = str.replaceAll(see, "a");
        }

        bw.write(String.valueOf(str.length()));
        bw.flush();
    }
}