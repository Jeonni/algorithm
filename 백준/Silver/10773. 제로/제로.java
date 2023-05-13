import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int result = 0;
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0) {
                stack.push(input);
            } else if (input == 0) {
                stack.pop();
            }
        }

        for (int s : stack) {
            result += s;
        }

        sb.append(result);
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}