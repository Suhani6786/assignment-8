package p1;

public class Fibonacci {
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            System.out.println(num1);
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        // Ensure an argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java p1.Fibonacci <N>");
            return;
        }

        // Parse command-line argument to integer
        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Input must be an integer.");
            return;
        }

        // Call Fibonacci function
        Fibonacci(N);
    }
}