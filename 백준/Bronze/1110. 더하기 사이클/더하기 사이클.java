import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        int count = 0;

        while(true){
            int left = num/10;
            int right = num%10;
            num = (right * 10) + ((left + right) % 10);
            count++;
            if(num == N){
                break;
            }
        }
        System.out.println(count);
    }
}