import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        int pagesDifferenceFront = p;
        int pagesDifferenceBack = n - p;

        int pagesTurnedFront = pagesDifferenceFront / 2;
        int pagesTurnedBack = (p % 2 != 0 && n % 2 == 0) ? pagesDifferenceBack / 2 + 1 : pagesDifferenceBack / 2;

        if (pagesTurnedFront < pagesTurnedBack) {
            System.out.println(pagesTurnedFront);
        } else if (pagesTurnedFront > pagesTurnedBack)

        {
            System.out.println(pagesTurnedBack);
        } else {
            System.out.println(pagesTurnedFront);
        }
    }
}