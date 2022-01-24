import java.util.*;
public class Main {
  private static Scanner sc = new Scanner(System.in);
  private static int calculateFine(int count, int amount) {
    if (count < 0) {
      return 0;
    } else {
      return amount * count;
    }
  }
  public static void main(String[] args) {

    int d1, m1, y1, d2, m2, y2;
    d1 = sc.nextInt();
    m1 = sc.nextInt();
    y1 = sc.nextInt();
    d2 = sc.nextInt();
    m2 = sc.nextInt();
    y2 = sc.nextInt();

    int fine = 0;
    if (y1 > y2) {
      fine = 10000;
    } else if (y1 == y2) {
      if (m1 > m2) {
        fine = calculateFine(m1 - m2, 500);
      } else if (m1 == m2) {
        fine = calculateFine(d1 - d2, 15);
      }
    }
    System.out.println(fine);
  }
}