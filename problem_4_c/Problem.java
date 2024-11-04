import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] a) {
    String output = "";
    HashSet <String> names = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int reqNum = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < reqNum; i++) {
      String input = sc.nextLine();
      if (names.contains(input)) {
        input = generateName(input, 1, names);
        output += input + "\n";
      } else {
        output += "OK\n";
      }

      names.add(input);
    }

    System.out.println(output);
  }

  private static String generateName(String name, int i, HashSet<String> names) {
    String generatedName = "";
    if (names.contains(name + i)) {
      generatedName = generateName(name, ++i, names);
      return generatedName;
    }

    generatedName = name + i;
    return generatedName;
  }
}
