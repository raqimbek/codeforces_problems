import java.util.*;
import java.util.regex.*;

public class WordCounter {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var input = scanner.nextLine();

    var pattern = Pattern.compile("[^a-zA-Z]");
    var matcher = pattern.matcher(input);

    var word = (matcher.replaceAll(""));
    var letterMap = word.chars()
        .mapToObj(c -> Character.valueOf((char) c))
        .reduce(
          new HashMap<Character, Integer>(),
          (a, c) -> {
            if (a.containsKey(c)) {
              a.put(c, a.get(c) + 1);
              return a;
            }

            a.put(c, 1);

            return a;
          },
          (m1,m2)  -> {m1.putAll(m2); return m1;}
        );
    letterMap.forEach((l, c) -> System.out.println(l + " - " + c));
  }
}
