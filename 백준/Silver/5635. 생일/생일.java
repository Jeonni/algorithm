import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int day;
    int month;
    int year;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> persionList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int day = Integer.parseInt(input[1]);
            int month = Integer.parseInt(input[2]);
            int year = Integer.parseInt(input[3]);

            persionList.add(new Person(name, day, month, year));
        }

        persionList.sort(Comparator.comparing((Person p) -> p.year)
                .thenComparing(p -> p.month)
                .thenComparing(p -> p.day));


        System.out.println(persionList.get(persionList.size() - 1).name);
        System.out.println(persionList.get(0).name);
    }
}