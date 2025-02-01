import java.util.Scanner;
import java.util.Arrays;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = -1;
    var y = -1;

    for (var i = 0; i < 5; i++) {
      var indexBefore1 = -1;
      var row = Arrays.stream(scanner.nextLine().split(" "))
                      .map(Integer::valueOf)
                      .toList();
      var iterator = row.iterator();

      while(iterator.hasNext()) {
        var n = iterator.next();
        if (n == 1) break;
        indexBefore1++;
      }

      if (indexBefore1 != 4) {
        x = i;
        y = indexBefore1 + 1;
      }
    }
    System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
  }
}
