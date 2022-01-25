import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int score;
        for (int i = 0; i < n; i++) {
            score = 1;
            for (int j = 0; j < arr[i]; j++) {
                if (j % 2 != 0) {
                    score += 1;
                } else {
                    score *= 2;
                }
            }
            System.out.println(score);
        }
    }
}