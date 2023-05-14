import java.io.*;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> weight = new HashMap<>();

        weight.put('H', 1);
        weight.put('C', 12);
        weight.put('O', 16);

        Stack<Integer> stack = new Stack<>(); 
        String formula = br.readLine();

        for (int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);
            if (c == ')') {
                int num = 0;
                while (true) {
                    if (stack.peek() == -2) {
                        stack.pop(); 
                        stack.push(num);
                        break;
                    }
                    num += stack.pop(); 
                }
            } else if (c == 'H' || c == 'C' || c == 'O') {
                stack.push(weight.get(c));
            } else if (Character.getNumericValue(formula.charAt(i)) >= 0 && Character.getNumericValue(formula.charAt(i)) <= '9') {
                int calc = stack.pop() * Character.getNumericValue(formula.charAt(i));
                stack.push(calc);
            } else {
                stack.push(-2);
            }
        }

        int totalWeight = 0;
        while (!stack.isEmpty()) {
            totalWeight += stack.pop();
        }
        sb.append(totalWeight);
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}