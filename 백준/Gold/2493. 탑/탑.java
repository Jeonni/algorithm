import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>(); 
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int top = Integer.parseInt(st.nextToken()); 
            while (!stack.isEmpty()) {
                if (stack.peek()[0] < top) {
                    stack.pop();
                } else { //
                    sb.append(stack.peek()[1] + " ");
                    break;
                }
            }
            if (stack.empty()) {
                sb.append("0 ");
            }
            stack.push(new int[]{top, i + 1});
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}