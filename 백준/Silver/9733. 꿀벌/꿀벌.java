import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] works = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        Map<String, Integer> workCount = new HashMap<>();

        for (String work : works) {
            workCount.put(work, 0);
        }

        double total = 0;
        String data = "";
        while ((data = br.readLine()) != null && !data.isEmpty()) {
            String[] workList = data.split(" ");
            total += workList.length;

            for (int i = 0; i < workList.length; i++) {
                if (workCount.containsKey(workList[i])) {
                    workCount.put(workList[i], workCount.get(workList[i]) + 1);
                }
            }
        }

        for (int i = 0; i < works.length; i++) {
            System.out.printf("%s %d %.2f\n", works[i], workCount.get(works[i]), workCount.get(works[i]) / total);
        }

        System.out.printf("Total %d 1.00", (int) total);
    }
}