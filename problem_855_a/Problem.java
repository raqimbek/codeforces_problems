import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    int possessionTimes = sc.nextInt();
    sc.nextLine();
    HashSet<String> names = new HashSet<>();
    String output = "";

    for (int i = 0; i < possessionTimes; i++) {
      String input = sc.nextLine();
      if (!names.contains(input)) {
        names.add(input);
        output += "NO\n";
        continue;
      }

      output += "YES!";
      if (i != possessionTimes - 1) {
        output += "\n";
      }
    }

    System.out.println(output);
  }
}
