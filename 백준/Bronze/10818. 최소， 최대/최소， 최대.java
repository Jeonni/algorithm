import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int max = list[0];
        int min = list[0];

        for (int i = 0; i < N; i++) {
            if( max < list[i]){
                max = list[i];
            }
            if (min > list[i]) {
                min = list[i];
            }
        }
        System.out.println(min + " " + max);
    }
}