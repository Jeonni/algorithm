import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int N = input.nextInt();
        int M = input.nextInt();

        for (int k = 1; k <= N; k++) {
            list.add(k);
        }

        for (int k = 0; k < M; k++) {
            int i = input.nextInt();
            int j = input.nextInt();

            int temp1 = list.get(j-1);
            int temp2 = list.get(i-1);

            list.set(i-1, temp1);
            list.set(j-1, temp2);

        }

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}