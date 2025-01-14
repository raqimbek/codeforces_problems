import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    var nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).toList();
    if (nums.size() != 2) return;
    var n = nums.get(0);
    var m = nums.get(1);

    if (n < 1 || m > 1000) return;

    var pairs = new HashMap<Double, Double>();
    var pairsNum = 0;

    for (var b = 0; b <= n && b <= m; b++) {
      var a = Math.sqrt(n - b);
      if (a >= 0) {
        if (Math.sqrt(m - a) == b &&
           !pairs.containsKey(a)) pairs.put(a,(double) b);
      }
    }
    System.out.println(pairs);
  }
}
