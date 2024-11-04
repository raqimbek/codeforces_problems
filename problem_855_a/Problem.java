import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] a) {
    System.out.println("How many times the diary has been possessed?");

    Scanner sc = new Scanner(System.in);
    int possessionTimes = sc.nextInt();
    sc.nextLine();
    System.out.println("possesion times: " + possessionTimes);
    HashSet<String> names = new HashSet<>();
    String output = "";

    System.out.println("Please, write the names of the people by the order of their possession of the diary. Write one name per line:");

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

    System.out.println("For each possession case I will print YES or NO. If a person possessed the diary more than once, I will print YES. Otherwise I will print NO.");
    System.out.println(output);
  }
}
