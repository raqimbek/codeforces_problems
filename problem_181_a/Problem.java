import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
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
    Map<List<String>, List<Integer>> possibleSideMap = new HashMap<>();
    Map<Integer, Integer> partialSideMap = new HashMap<>();
    
    for (var i = 0; i < n; i++) {
      var row = Arrays.asList(scanner.nextLine().split(""));

      var RowIsProper = row.stream()
                           .allMatch(c -> c.equals(".") || c.equals("*"));

      if (!RowIsProper && row.size() != m) return;

      // table.add(row);

      if(row.contains("*")) {
        if (row.stream().filter(c -> c.equals("*")).count() >= 2) {
          int first = -1;
          int last = -1;

          for(var j = 0; j < row.size(); j++) {
            if (row.get(j).equals("*")) {
              if (first != -1) {
                last = j;
                continue;
              }
              first = j;
            }
          }
          
          possibleSideMap.put(row, List.of(first, last));
          continue;
        }
/*
// temp start
      }
    }
    
    System.out.print("possibleSideMap: ");
    System.out.println(possibleSideMap);

// temp end
*/

        // partial side
        for(var j = 0; j < row.size(); j++) {
          if (row.get(j).equals("*")) {
            var endPoint = Integer.valueOf(j);
            var possibleSideNum = possibleSideMap.entrySet()
                           .stream()
                           .filter(e -> e.getValue()
                                         .stream()
                                         .filter(ep -> ep.equals(endPoint))
                                         .findFirst()
                                         .isPresent()
                           )
                           .count();
            for (var k = 0; k < possibleSideNum; k++) {
              partialSideMap.put(i, j);
            }
          }
        }
      }
    }
    System.out.print("partialSideMap: ");
    System.out.println(partialSideMap);
    System.out.print("possibleSideMap: ");
    System.out.println(possibleSideMap);
  }
}
