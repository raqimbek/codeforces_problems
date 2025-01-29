import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var input = new Scanner(System.in).nextLine().split(" ");
    System.out.println(Double.valueOf(Math.floor((Integer.valueOf(input[0])*Integer.valueOf(input[1]))/2)).intValue());
  }
}
