import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int minute = (h*60) + m;
        int totalMinute = minute - 45;
        int resultHour = totalMinute/60;
        int resultMinute = totalMinute%60;

        if(resultMinute < 0){
            resultMinute = resultMinute+60;
            resultHour = 23;
            System.out.println(resultHour + " " + resultMinute);
        }
        else{
            System.out.println(resultHour + " " + resultMinute);
        }


    }
}