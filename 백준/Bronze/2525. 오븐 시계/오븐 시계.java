import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int need = sc.nextInt();
        int totalMinute = (h*60) + m + need;
        int resultHour = totalMinute/60;
        int resultMinute = totalMinute%60;
        if(resultHour >= 24){
            resultHour %= 24;
            System.out.println(resultHour + " " + resultMinute);
        }
        else{
            System.out.println(resultHour + " " + resultMinute);
        }
    }
}