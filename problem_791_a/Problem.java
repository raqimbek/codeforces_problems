import java.util.Scanner;
import java.util.Arrays;

public class Problem {
  public static void main(String[] args) {
    var input = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).map(Integer::valueOf).toList();
    var a = input.get(0);
    var b = input.get(1);
    var counter = 0;

    while (a <= b) {
      a *= 3;
      b *= 2;
      counter++;
    }

    System.out.println(counter);
  }
}
