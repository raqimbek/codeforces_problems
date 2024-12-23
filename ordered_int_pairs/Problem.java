import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
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

      System.out.print("subtractions list: ");
      System.out.println(subtractions);

      System.out.print("subtractions.size() - ");
      System.out.println(subtractions.size());
      for (int k = 0; k < subtractions.size(); k++) {
        System.out.println("inside first loop. current value of k = " + k);
        System.out.print("subtractions.get(" + k + ") - ");
        System.out.println(subtractions.get(k));

        int a = subtractions.get(k);
        System.out.print("a = ");
        System.out.println(a);

        System.out.print("n - a = ");
        System.out.println(n - a);
        System.out.print("subtractions.contains(");
        System.out.print(n - a);
        System.out.print(") = ");
        System.out.println(subtractions.contains(n - a));

        if (subtractions.contains(n - a)) {
          var list = List.of(a, n - a);
          System.out.print("list just created: ");
          System.out.println(list);
          pairs.add(list);
        }
      }

      System.out.print("final pairs: ");
      System.out.println(pairs);
      System.out.print("pairs.size() - ");
      System.out.println(pairs.size());
    }
  }
}
