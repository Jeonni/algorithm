import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while(!input.equals("EOI")){
            if(input.toLowerCase().contains("nemo")){
                System.out.println("Found");
            }
            else{
                System.out.println("Missing");
            }
            input = br.readLine();
        }
        br.close();
    }
}