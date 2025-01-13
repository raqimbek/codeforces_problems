import java.util.Scanner;
import java.util.Arrays;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    var nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).toList();
    if (nums.size() != 2) return;
    var n = nums.get(0);
    var m = nums.get(1);

    if (n <= 1 || m >= 1000) return;

    var pairsNum = 0;

    for (var b = 0; b <= n && b <= m; b++) {
      System.out.print("n = ");
      System.out.println(n);
      System.out.print("b = ");
      System.out.println(b);
      System.out.print("Math.sqrt(n - b) = ");
      System.out.print("Math.sqrt(" + n + " - " + b + ") = ");
      System.out.println(Math.sqrt(n - b));
      System.out.print("Math.sqrt(n - b) >= 0");
      System.out.print(" <=> ");
      System.out.print("Math.sqrt(" + n + " - " + b + ") >= 0: ");
      System.out.println(Math.sqrt(n - b) >= 0);
      var a = Math.sqrt(n - b);
      if (a >= 0) {
        System.out.print("a = ");
        System.out.println(a);
        System.out.print("Math.sqrt(m - a) == b");
        System.out.print(" <=> ");
        System.out.print("Math.sqrt(" + m + " - " + a + ") == " + b + ": ");
        System.out.println(Math.sqrt(m - a) == b);
        if (Math.sqrt(m - a) == b) pairsNum++;
        System.out.print("pairsNum = ");
        System.out.println(pairsNum);
      }
    }
  }
}
