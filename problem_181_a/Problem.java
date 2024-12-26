import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var input = Arrays.asList(scanner.nextLine().split(" "));

    var isInputInteger = input.stream()
      .allMatch(c -> {
        try {
          var i = Integer.parseInt(c);
        } catch (NumberFormatException e) {
          System.out.println("input is not an integer");
          return false;
        }
        return true;
      });

    if (input.size() != 2 || !isInputInteger) return;

    var tableScheme = input.stream()
                      .map(Integer::valueOf)
                      .toList();

    var n = tableScheme.get(0);
    var m = tableScheme.get(1);

    if (n < 2 || m > 100) return;

    List<List<String>> table = new ArrayList<>();
    
    for (var i = 0; i < n; i++) {
      var row = Arrays.asList(scanner.nextLine().split(""));

      var RowIsProper = row.stream()
                           .allMatch(c -> c.equals(".") || c.equals("*"));

      if (!RowIsProper && row.size() != m) return;

      // table.add(row);
    }
    
    
  }
}
