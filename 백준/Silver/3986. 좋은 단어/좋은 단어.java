import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) stack.push(str.charAt(j));
                else if (!stack.peek().equals(str.charAt(j))) stack.push(str.charAt(j));
                else stack.pop();
            }
            if (stack.size() == 0) count++;
            stack.clear();
        }

        sb.append(count);
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}