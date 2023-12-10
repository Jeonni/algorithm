import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words = br.readLine();
        String[] str = new String[words.length()];
        String[] opposite = new String[words.length()];

        for (int i = 0; i < words.length(); i++) {
            str[i] = String.valueOf(words.charAt(i));
            opposite[i] = String.valueOf(words.charAt(i));
        }

        int j = words.length() - 1;
        for (int i = 0; i < words.length() / 2; i++) {
            opposite[i] = str[j];
            opposite[j] = str[i];
            j--;
        }

        if (Arrays.equals(str, opposite)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
    }
}