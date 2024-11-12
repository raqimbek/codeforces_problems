import java.util.*;

public class WordCounter {

  public static void main(String[] a) {
    var scanner = new Scanner(System.in);
    var input = scanner.nextLine();

    List<Character> letters = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    var letterCounter = new TreeMap<Character, Integer>();

    input.toLowerCase().chars()
         .mapToObj(c -> (char) c)
         .toList().forEach(c -> {
           if (letters.contains(c)) {
             if (letterCounter.get(c) != null) {
               letterCounter.put(c, letterCounter.get(c)+1);
             } else {
               letterCounter.put(c,1);
             }
           }
         });

    letterCounter.entrySet().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
  }
}
