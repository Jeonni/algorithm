import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = input.nextInt();
        int M = input.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(i, 0);
        }

        for (int a = 0; a < M; a++) {

            int i = input.nextInt();
            int j = input.nextInt();
            int k = input.nextInt();

            for (int b = i - 1; b <= j - 1; b++) {
                list.set(b, k);
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}