import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] list = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i = 0;
        while(st.hasMoreElements()){
            list[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int result1 = flip(list[0]);
        int result2 = flip(list[1]);

        if(result1 > result2){
            System.out.println(result1);
        } else if (result2 > result1) {
            System.out.println(result2);
        }
    }

    static int flip(int num){
        int result = (num % 10) * 100 + ((num % 100) / 10) * 10 + (num / 100);
        return result;
    }
}
