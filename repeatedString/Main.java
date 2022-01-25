import java.util.*;

public class Main {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String str = sc.nextLine();
    long count = sc.nextLong();

    int numberOfA = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        numberOfA++;
      }
    }

    long confirmedReps = (count / str.length());
    int unconfirmedReps = (int) (count % str.length());

    long answer = confirmedReps * numberOfA;
    if (unconfirmedReps != 0) {
      for (int i = 0; i < unconfirmedReps; i++) {
        if (str.charAt(i) == 'a') {
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}