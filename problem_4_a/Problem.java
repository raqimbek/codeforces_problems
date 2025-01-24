import java.util.Scanner;

public class Problem {
  public static void main(String[] arg) {
    var scanner = new Scanner(System.in);
    var input = Integer.valueOf(scanner.nextLine());
    if (input < 1 || input > 100) {
      return;
    }

    for (int i = 0, j = input; i <= input && j >= 0; i++, j--) {
      System.out.print("i = ");
      System.out.println(i);
      System.out.print("j = ");
      System.out.println(j);
      if (i > 2 && j > 2 && (i + j) == input && i % 2 == 0 && j % 2 == 0) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
