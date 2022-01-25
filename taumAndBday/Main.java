import java.util.*;
public class Main {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int count = sc.nextInt();
    long b, w, bc, wc, z;
    for (int i = 0; i < count; i++) {
      b = sc.nextLong();
      w = sc.nextLong();
      bc = sc.nextLong();
      wc = sc.nextLong();
      z = sc.nextLong();
      long totalCost = 0;
      if (bc == wc) {
        totalCost = (bc * b) + (wc * w);
      } else {
        if (Math.abs(bc - wc) < z) {
          totalCost = (bc * b) + (wc * w);
        } else {
          if (bc > wc) {
            totalCost = (b * wc) + (wc * w) + (b * z);
          } else {
            totalCost = (b * bc) + (bc * w) + (w * z);
          }
        }
      }
      System.out.println(totalCost);
    }
  }
}