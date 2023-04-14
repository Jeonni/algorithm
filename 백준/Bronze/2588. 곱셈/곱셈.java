import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = (y % 10);
        int b = (y%100)/10;
        int c = (y/100);

        System.out.println(x*a);
        System.out.println(x*b);
        System.out.println(x*c);
        System.out.println(x*y);

    }
}
