import java.util.*;

public class WordCounter {

  public static void main(String[] a) {
    var scanner = new Scanner(System.in);
    var input = scanner.nextLine();

    List<Character> letters = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    var letterCounter = new TreeMap<Character, Integer>();

    input.toLowerCase().chars()
         .mapToObj(c -> (char) c)
         .filter(c -> letters.contains(c)).toList()
         .forEach(c -> letterCounter.put(c,
           Optional.ofNullable(letterCounter.get(c))
           .orElse(0)+1));

    letterCounter.entrySet()
      .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
  }
}
