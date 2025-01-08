import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var str = String.join("",scanner.nextLine().split(" "));
    var reversedStr = new StringBuilder(str).reverse();
    if (reversedStr.toString().equals(str)) System.out.println("it's a palindrome");
  }
}
