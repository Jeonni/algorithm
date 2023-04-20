import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        double creditSum = 0.0;

        for (int i = 0; i < 20; i++) {
            String title = in.next();
            double credit = in.nextDouble();
            String grade = in.next();

            if(!grade.equals("P")) creditSum += credit;

            switch (grade) {
                case "A+":
                    sum += credit * 4.5;
                    break;
                case "A0":
                    sum += credit * 4.0;
                    break;
                case "B+":
                    sum += credit * 3.5;
                    break;
                case "B0":
                    sum += credit * 3.0;
                    break;
                case "C+":
                    sum += credit * 2.5;
                    break;
                case "C0":
                    sum += credit * 2.0;
                    break;
                case "D+":
                    sum += credit * 1.5;
                    break;
                case "D0":
                    sum += credit * 1.0;
                    break;
                default:
                    break;
            }
        }
        System.out.printf(String.format("%.6f", (sum/creditSum)));
    }
}