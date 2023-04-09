import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static int hansu(int n) {
        int count = 0;
        int a, b, c, d;

        if (n < 100) {
            return n;
        }
        else{
            count = 99;
            for (int i = 100; i <= n; i++) {
                a = (i / 10) / 10;
                b = (i / 10) % 10;
                c = (i % 10);
                if((a-b) == (b-c)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(hansu(Integer.parseInt(br.readLine())));

    }
}