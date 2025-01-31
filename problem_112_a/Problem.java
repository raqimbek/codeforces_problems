import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var str1 = scanner.nextLine();
    var str2 = scanner.nextLine();
    System.out.println(str1.compareToIgnoreCase(str2));
  }
}
