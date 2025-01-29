import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var matrix = new ArrayList<List>();
    var initCoordinates = new HashMap<Integer, Integer>();
    for (var i = 0; i < 5; i++) {
      var row = (new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).toList()));
      var initIndex = row.stream()
         .reduce(0, (a, n) -> {if(n != 1) return ++a; else return a;});
      System.out.print("initIndex = ");
      System.out.println(initIndex);
      System.out.print("row.size() = ");
      System.out.println(row.size());
      System.out.print("initIndex < row.size() = ");
      System.out.println(initIndex < row.size());
      if (initIndex < row.size()) initCoordinates.put(i, initIndex);
      matrix.add(row);
    }

    System.out.print("coordinates: ");
    System.out.println(initCoordinates);
  }
}
