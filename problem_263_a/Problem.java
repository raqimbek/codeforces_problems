import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = -1;
    var y = -1;

    for (var i = 0; i < 5; i++) {
      var indexBefore1 = Arrays.stream(scanner.nextLine().split(" "))
                               .map(Integer::valueOf)
                               .reduce(() -> new HashMap<String, Integer>(Map.of("isOneOccurred", 0, "indexBefore1", -1)), (a, n) -> {
                                 System.out.println("current number: " + n);
                                 System.out.println("accumulater: " + a);

                                 if (a.get("isOneOccurred").equals(1)) return a;

                                 if (n == 1) {
                                   a.put("isOneOccurred", 1);
                                   return a;
                                 }

                                 if (n != 1) {
                                   a.put("indexBefore1", ++a.get("indexBefore1"));
                                   return a;
                                 }
                               }, (a1, a2) -> {a1.putAll(a2); return a1;}).get("indexBefore1");
      if (indexBefore1 < 4) {
        x = i;
        System.out.println("index before 1: " + indexBefore1);
        y = indexBefore1 + 1;
      }
    }
    System.out.println("x = " + x + "; y = " + y);
    System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
  }
}
