import java.util.Scanner;
import java.util.Arrays;

public class Problem {
  public static void main(String[] a) {
    var scanner = new Scanner(System.in);
    var n = Integer.valueOf(scanner.nextLine());
    var problemNum = 0;

    for (int i = 0; i < n; i++) {
      var response = scanner.nextLine();
      var majority = Arrays.stream(response.split(" "))
            .map(Integer::valueOf)
            .filter(r -> r == 1)
            .count() >= 2 ?
              true : false;
      if (majority) problemNum++;
    }
    System.out.println(problemNum);
  }
}
