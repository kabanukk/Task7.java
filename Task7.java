import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int i = 0;
        int fib1 = 1;
        int fib2 = 1;
        int sum = 0;
        while(i != N - 1){
            sum = fib1 + fib2;
            fib2 = fib1;
            fib1 = sum;
            i = i + 1;
        }
        System.out.println(fib2);
    }
}
