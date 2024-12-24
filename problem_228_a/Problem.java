import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var colorList = Arrays.stream(scanner.nextLine().split(" "))
                          .map(Integer::valueOf)
                          .collect(Collectors.toList());

    var shoesNum = colorList.stream()
             .filter(i -> Collections.frequency(colorList, i) > 1)
             .collect(
               Collectors.groupingBy(
                 i -> i,
                 Collectors.counting()
               )
             )
             .entrySet()
             .stream()
             .map(e -> e.getValue().intValue() - 1)
             .reduce(0, (a, n) -> a + n);
    System.out.println(shoesNum);
  }
}
