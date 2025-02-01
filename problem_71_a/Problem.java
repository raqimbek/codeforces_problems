import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var wordNum = Integer.valueOf(scanner.nextLine());

    if (wordNum < 1 || wordNum > 100) return;

    var output = new StringBuilder();

    while (wordNum > 0) {
      wordNum--;
      var word = scanner.nextLine();
      if (word.length() <= 10) {
        output.append(word);
        output.append("\n");
        continue;
      }

      output.append(word.substring(0,1));
      output.append(word.length() - 2);
      output.append(word.substring(word.length()-1));
      output.append("\n");
    }

    System.out.println(output);
  }
}
