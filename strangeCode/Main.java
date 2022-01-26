import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();

        long top = 3;
        long subs = 3;
        while (true) {
            if (n <= subs) {
                System.out.println(subs - n + 1);
                break;
            }
            top *= 2;
            subs += top;
        }
    }
}