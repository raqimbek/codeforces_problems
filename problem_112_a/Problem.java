import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var str1 = scanner.nextLine();
    var str2 = scanner.nextLine();
    var result = str1.compareToIgnoreCase(str2);
    System.out.println(result > 0 ? 1 : result < 0 ? -1 : result);
  }
}
