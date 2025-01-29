import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var inputArr = scanner.nextLine().split(" ");
    var m = inputArr[0];
    var n = inputArr[1];
    System.out.println(Double.valueOf(Math.floor((Integer.valueOf(m)*Integer.valueOf(n))/2)).intValue());
  }
}
