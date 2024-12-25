import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var tableScheme = Arrays.stream(scanner.nextLine().split(" "))
                      .limit(2)
                      .map(Integer::valueOf)
                      .toList();

    if (tableScheme.size() != 2) return;

    var n = tableScheme.get(0);
    var m = tableScheme.get(1);

    if (n < 2 || m > 100) return;

    List<List<String>> table = new ArrayList<>();
    
    for (var i = 0; i < n; i++) {
      var row = Arrays.stream(scanner.nextLine().split(""))
                      .filter(c -> c.equals("*") || c.equals("."))
                      .limit(m)
                      .toList();

      System.out.println(row);

      if (row.size() != m) return;

      table.add(row);
    }

    System.out.println(table);
  }
}
