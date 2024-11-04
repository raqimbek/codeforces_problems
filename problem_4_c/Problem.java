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
        int j = 1;
        while (names.contains(input + j)) {
          j++;
        }
        input += j;
        output += input + "\n";
      } else {
        output += "OK\n";
      }

      names.add(input);
    }

    System.out.println(output);
  }
}
