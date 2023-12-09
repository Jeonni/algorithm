import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 입력 받은 문자열을 공백을 기준으로 나누어 배열로 변환
        String str = br.readLine();
        String[] strArr = str.split(" ");

        // 문자열 배열을 정수 배열로 변환
        Integer[] compare = new Integer[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            compare[i] = Integer.parseInt(strArr[i]);
        }

        // 비교할 고정 배열
        Integer[] fix = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int count = 0;
            if (fix[i].equals(compare[i])) {
                sb.append(0).append(" ");
            } else {
                while (fix[i] != compare[i]) {
                    if (fix[i] < compare[i]) {
                        compare[i]--;
                        count--;
                    } else {
                        compare[i]++;
                        count++;
                    }
                }
                sb.append(count).append(" ");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
    }
}