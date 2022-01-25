import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int breads = 0;
        int flag;
        if (arr.length > 2 || ((arr[0] + arr[1]) % 2 == 0)) {
            flag = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] % 2 != 0) {
                    breads += 2;
                    arr[i]++;
                    arr[i + 1]++;
                }
            }
            for (int t : arr) {
                if (t % 2 != 0) {
                    flag = -1;
                    break;
                }
            }
        } else {
            flag = -1;
        }
        if (flag == 1) {
            System.out.println(breads);
        } else if (flag == -1) {
            System.out.println("NO");
        }
    }
}