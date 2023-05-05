import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] tokens = input.split("\\-");

        int answer = 0;
        for (int i = 0; i < tokens.length; i++) {
            String[] operands = tokens[i].split("\\+");
            int sum = 0;
            for (String operand : operands) {
                sum += Integer.parseInt(operand);
            }
            if (i == 0) answer = sum;
            else answer -= sum;
        }
        System.out.println(answer);
    }
}