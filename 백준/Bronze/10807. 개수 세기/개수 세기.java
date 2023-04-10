import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>();

        int N = in.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            intList.add(num);
        }

        int v = in.nextInt();

        for (int i: intList) {
            if(i == v){count++;}
        }

        System.out.println(count);
    }
}
