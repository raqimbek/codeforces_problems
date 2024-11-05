import java.util.Scanner;
import java.util.ArrayList;

public class Problem {
  public static void main(String[] a) {
    String output = "";
    ArrayList <String> names = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int reqNum = sc.nextInt();
    sc.nextLine();

    while(reqNum != 0) {
      reqNum--;
      String input = sc.nextLine();

      if (!names.contains(input)) {
        names.add(input);
        output += "OK\n";
        continue;
      }

      int i = 0;
      while (names.contains(input + ++i)) {}
      input += i;

      names.add(input);
      output += input + "\n";
    }

    System.out.println(output);
  }
}
