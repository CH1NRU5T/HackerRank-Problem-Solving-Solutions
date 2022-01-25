import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] - arr[j] == d) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}