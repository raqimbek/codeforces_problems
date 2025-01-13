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

    for (int a = 0, b = 0; a <= n && a <= m && b <= n && b <= m; a++, b++) {
      System.out.print("a = ");
      System.out.println(a);
      System.out.print("b = ");
      System.out.println(b);
      System.out.print("a <= n: ");
      System.out.println(a <= n);
      System.out.print(a + " <= " + n + ": ");
      System.out.println(a <= n);
      System.out.print("a <= m: ");
      System.out.println(a <= m);
      System.out.print(a + " <= " + m + ": ");
      System.out.println(a <= m);
      System.out.print("b <= n: ");
      System.out.println(b <= n);
      System.out.print(b + " <= " + n + ": ");
      System.out.println(b <= n);
      System.out.print("b <= m: ");
      System.out.println(b <= m);
      System.out.print(b + " <= " + m + ": ");
      System.out.println(b <= m);
      System.out.print("a*a + b == n: ");
      System.out.println(a*a + b == n);     
      System.out.print(a + "*" + a + " + " + b + " == " + n + ": ");
      System.out.println(a*a + b == n);
      System.out.print("b*b + a == m: ");
      System.out.println(b*b + a == m);
      System.out.print(b + "*" + b + " + " + a + " == " + m + ": ");
      System.out.println(b*b + a == m);
      if (a*a + b == n && a + b*b == m) pairsNum++;
      System.out.print("pairsNum = ");
      System.out.println(pairsNum);
    }
  }
}
