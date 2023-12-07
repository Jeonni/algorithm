import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        // 알파벳 별 등자 횟수를 저장할 맵
        Map<Character, Integer > hashMap = new HashMap<>();

        // 문자열에서 알파벳만 추출하여 처리
        char[] characters = str.replaceAll("[^a-zA-Z]]", "").toUpperCase().toCharArray();

        // 알파벳 별로 등장 횟수를 맵에 기록
        for(char ch : characters){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        char maxAlphabet = ' ';
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxAlphabet = entry.getKey();
                maxCount = entry.getValue();
            } else if (entry.getValue() == maxCount){
                maxAlphabet = '?';
            }
        }

        bw.write(maxAlphabet);
        bw.flush();
    }
}