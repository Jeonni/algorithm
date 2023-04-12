import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N >= 1 && N <= 100){
            for(int i= 1; i<=N; i++){
                for(int j=1; j<=N-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("range error");
        }
    }
}