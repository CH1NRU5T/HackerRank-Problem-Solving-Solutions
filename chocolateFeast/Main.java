import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int n, c, m;
            n = sc.nextInt();
            c = sc.nextInt();
            m = sc.nextInt();

            int chocolates = n / c;
            int wrappers = chocolates;

            while (wrappers >= m) {
                int newChocolates = wrappers / m;
                chocolates += newChocolates;
                wrappers = (wrappers - (m * newChocolates)) + newChocolates;
            }
            System.out.println(chocolates);
        }
    }
}