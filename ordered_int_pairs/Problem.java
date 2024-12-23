import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var t = Integer.valueOf(scanner.nextLine());

    if (t < 1 || t > 99) return;

    for (var i = 0; i < t; i++) {
      var n = Integer.valueOf(scanner.nextLine());
      if (n < 2 || n > 100) return;
      List<List> pairs = new ArrayList<>();
      List<Integer> subtractions = new ArrayList<>();

      for (int j = n.intValue() - 1; j > 0; j--) {
        subtractions.add(j);
      }


      for (int k = 0; k < subtractions.size(); k++) {
        int a = subtractions.get(k);

        if (subtractions.contains(n - a)) {
          pairs.add(List.of(a, n - a));
        }
      }

      System.out.println(pairs.size());
    }
  }
}
