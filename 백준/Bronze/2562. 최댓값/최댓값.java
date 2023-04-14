import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arrayList.add(n);
        }

        System.out.println(Collections.max(arrayList));
        System.out.println(arrayList.indexOf(Collections.max(arrayList)) + 1);

    }
}