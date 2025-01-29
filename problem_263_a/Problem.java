import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = -1;
    var y = -1;

    for (var i = 0; i < 5; i++) {
      var indexPriorTo1 = Arrays.stream(scanner.nextLine().split(" "))
                                 .map(Integer::valueOf)
                                 .reduce(-1, (a, n) -> {
                                   System.out.println("a = " + a);
                                   if (n != 1) return ++a;
                                   return a;
                                 });
      System.out.println("indexPriorTo1 = " + indexPriorTo1);
      if (indexPriorTo1 < 4) {
        x = i;
        y = indexPriorTo1 + 1;
      }
      System.out.println("y = " + y);
      System.out.println("x = " + x);
    }
    System.out.print(x);
    System.out.print("=");
    System.out.println(y);
  }
}
