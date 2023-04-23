import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 배열에 값 담기 1-30까지
        int list[] = new int[30];
        for (int i = 1; i <= list.length; i++) {
            list[i - 1] = i;
        }

        // 비교할 배열에 값 하나씩 할당
        int compareList[] = new int[28];
        for (int i = 0; i < compareList.length; i++) {
            int num = input.nextInt();
            compareList[i] = num;
        }

        // 크기 순으로 정렬하기
        Arrays.sort(list);
        Arrays.sort(compareList);

        int i = 0;
        int j = 0;

        // 중복되지 않는 값을 찾아서 출력
        while (i < list.length && j < compareList.length) {
            if (list[i] == compareList[j]) {
                i++;
                j++;
            } else if (list[i] < compareList[j]) {
                System.out.println(list[i]);
                i++;
            }
        }

        while (i < list.length) {
            System.out.println(list[i]);
            i++;
        }

        while (j < compareList.length) {
            System.out.println(compareList[j]);
            j++;
        }
    }
}