import java.util.*;

public class Main {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int count = sc.nextInt();
    List<Integer> arr = new ArrayList<Integer>();

    for (int i = 0; i < count; i++) {
      arr.add(sc.nextInt());
    }

    List<Integer> ans = new ArrayList<Integer>();
    while (arr.size() > 0) {
      int temp = arr.get(0);
      if (arr.indexOf(temp) != arr.lastIndexOf(temp)) {
        ans.add(arr.lastIndexOf(temp) - arr.indexOf(temp));
        arr.removeAll(Arrays.asList(temp));
      } else {
        arr.remove(Integer.valueOf(temp));
      }
    }
    if (ans.size() > 0) {
      Collections.sort(ans);
      System.out.println(ans.get(0));
    } else {
      System.out.println(-1);
    }

  }
}