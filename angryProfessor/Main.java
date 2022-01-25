import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        count = sc.nextInt();
        int n, k;
        for (int i = 0; i < count; i++) {
            // Enter n and k
            n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            int numberOfAttendees = 0;
            for (int l = 0; l < arr.length; l++) {
                if (arr[l] <= 0) {
                    numberOfAttendees++;
                }
            }
            if (numberOfAttendees >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}