import java.util.*;
public class Main {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int count = sc.nextInt();
    int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      arr[i] = sc.nextInt();
    }

    int singleSteps = 0;
    int doubleSteps = 0;

    for (int i = 0; i < count - 1; i += 2) {
      if (arr[i] == 1) {
        --i;
        singleSteps++;
        doubleSteps--;
        doubleSteps++;
      } else {
        doubleSteps++;
      }
    }
    System.out.println(singleSteps + doubleSteps);
  }
}