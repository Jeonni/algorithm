import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int groupNum = 0;
        int groupNumSum = 0;
        int top = 1;
        int bottom = 1;

        if (x == 1) {
            System.out.println("1/1");
        } else {
            while (groupNumSum < x) {
                groupNum++;
                groupNumSum = groupNum * (groupNum + 1) / 2;
            }
            int num = x - (groupNum - 1) * groupNum / 2;
            if (groupNum % 2 == 0) {
                top = num;
                bottom = groupNum - num + 1;
            } else {
                top = groupNum - num + 1;
                bottom = num;
            }
            System.out.println(top + "/" + bottom);
        }
    }
}