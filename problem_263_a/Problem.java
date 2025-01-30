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
                               .filter(n -> n == 1)
                               .reduce(-1, (a, n) -> {
                                 System.out.println("current number: " + n);
                                 System.out.println("accumulater: " + a);
                                 if (n != 1) return ++a;
                                 return a;
                               });
      
      System.out.println("index before 1: " + indexBefore1);

      if (indexBefore1 != 4) {
        x = i;
        y = indexBefore1 + 1;
        System.out.println("inside if (indexBefore1 != 4) ");
      }
    }
    System.out.println("x = " + x + "; y = " + y);
    System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
  }
}
