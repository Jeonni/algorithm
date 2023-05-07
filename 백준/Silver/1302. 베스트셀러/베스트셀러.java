import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            hashMap.put(book, hashMap.getOrDefault(book, 0) + 1);
        }

        String bestSeller = "";
        int maxSell = 0;
        for(String book : hashMap.keySet()){
            int sell  = hashMap.get(book);
            if(sell > maxSell){
                maxSell = sell;
                bestSeller = book;
            }
        }
        System.out.println(bestSeller);
    }
}