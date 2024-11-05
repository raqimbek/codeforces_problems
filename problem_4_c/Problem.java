import java.util.Scanner;
import java.util.TreeMap;

public class Problem {
  public static void main(String[] a) {
    String output = "";
    TreeMap <String, Integer> names = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    int reqNum = sc.nextInt();
    sc.nextLine();

    while(reqNum != 0) {
      reqNum--;
      String input = sc.nextLine();

      if (names.containsKey(input)) {
        int duplicateNum = names.get(input) + 1;
        names.put(input, duplicateNum);
        output += input + duplicateNum + "\n";
        continue;
      }

      names.put(input, 0);
      output += "OK\n";
    }

    System.out.println(output);
  }
}
