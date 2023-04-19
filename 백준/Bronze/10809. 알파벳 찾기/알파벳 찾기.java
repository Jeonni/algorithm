import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[26];

        // 문자열 S에 각 문자의 위치를 가리킬 int형 배열
        // 모두 -1로 초기화
        for (int i = 0; i < list.length; i++) {
            list[i] = -1;
        }


        // 문자열 S가 주어짐
        String S = br.readLine();

        // 반복문을 통해 문자열의 각 문자를 검사
        // charAt() 메소드를 통해 문자를 추출한 뒤, ch 변수에 저장
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            // ch의 문자의 위치를 앞서 만든 list 배열의 값으로 바꿔 줌
            // 문제에서 위치는 0부터 시작하므로 ch 문자의 위치는 i가 되는 것을 알 수 있음
            // list 배열의 인덱스는 ch가 갖고 있는 문자 인코딩(아스키 코드 값과 동일)에 'a'또는 97을 뺴주면 된다.
            // (a는 10진수로 97 값에 대응)
            if (list[ch - 'a'] == -1) { // list 원소 값이 -1인 경우에만 초기화
                // -1인 경우에는 배열의 원소 값을 변경하고, -1이 아닌 경우네는 배열의 원소 값을 변경하지 않음
                list[ch - 'a'] = i;
            }
        }

        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}