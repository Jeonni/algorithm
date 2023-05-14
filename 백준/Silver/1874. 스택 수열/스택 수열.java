import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        int stackNum = 1;

        for (int i = 0; i < n; i++) {
            while (stackNum <= list[i]) {
                stack.push(stackNum);
                sb.append("+\n");
                stackNum++;
            }
            if (stack.peek() == list[i]) { 
                stack.pop(); 
                sb.append("-\n");
            }
        }

        if (stack.isEmpty()) {
            bw.write(sb.toString());
        } else {
            bw.write("NO");
        }

        br.close();
        bw.close();
    }
}