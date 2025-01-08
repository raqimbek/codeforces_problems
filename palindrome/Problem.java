import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var str = scanner.nextLine();
    var reversedStr = new StringBuilder(str).reverse();
    if (reversedStr.toString().equals(str)) System.out.println("it's a palindrome");
  }
}
