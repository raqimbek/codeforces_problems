import java.util.Arrays;
import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var sentence = scanner.nextLine();

    var word = Arrays.stream(sentence.split(" "))
                      .reduce("", (a,w) -> {
                        if (w.length() > a.length()) return w;
                        return a;
                      });
    System.out.println(word);
  }
}
