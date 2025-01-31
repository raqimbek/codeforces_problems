import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    scanner.nextLine();
    var input = scanner.nextLine().split("");
    var counter = 0;

    for (var i = 0; i < input.length; i++) {
      if (i+1 < input.length && input[i].equals(input[i+1])) counter++;
    }
    System.out.println(counter);
  }
}
