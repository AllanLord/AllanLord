import java.util.*;

public class Taylor {

    static float Taylor_exponential(int n, float x) {
        float exp_sum = 1;

        for (int i = n - 1; i > 0; --i)
            exp_sum = 1 + x * exp_sum / i;

        return exp_sum;
    }

    static void getTaylorSeries() {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Input n: ");
            int n = scan.nextInt();

            System.out.print("Input x: ");
            float x = scan.nextInt();

            if (n > 0 && x > 0) {
                System.out.println("e^x = " + Taylor_exponential(n, x));
            }
        }

    }

}