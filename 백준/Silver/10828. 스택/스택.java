import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }
    }

    public static void push(int item) {
        stack.push(item);
    }

    public static void pop() {
        if(stack.empty()){
            System.out.println("-1");
        }
        else{
            System.out.println(stack.pop());
        }
    }

    public static void size() {
        System.out.println(stack.size());
    }

    public static void empty() {
        if (stack.empty()) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

    public static void top(){
        if(stack.empty()){
            System.out.println("-1");
        }
        else{
            System.out.println(stack.peek());
        }
    }
}
