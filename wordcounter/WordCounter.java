import java.util.TreeMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordCounter {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var input = scanner.nextLine();

    input.toLowerCase().chars()
        .filter(c -> Character.isAlphabetic(c))
        .mapToObj(c -> Character.valueOf((char) c))
        .collect(
           Collectors.toMap(
              l -> l,
              l -> String.valueOf(l),
              (l1, l2) ->
                 new StringBuilder()
                     .append(l1)
                     .append(l2)
                     .toString()
              ,
              () -> new TreeMap<Character, String>()
           )
        )
        .entrySet()
        .forEach(e ->
           System.out.println(e.getKey() + ": " + e.getValue().length())
        );
  }
}
