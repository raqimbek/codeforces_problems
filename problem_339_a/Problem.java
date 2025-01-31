import java.util.Scanner;
import java.util.Arrays;

public class Problem {
  public static void main(String[] args) {
    System.out.println(String.join("+", Arrays.stream(new Scanner(System.in).nextLine().split("\\+")).sorted().toList()));
  }
}
