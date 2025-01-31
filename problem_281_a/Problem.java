import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var str = new Scanner(System.in).nextLine();
    System.out.println(new StringBuilder(str.substring(0,1).toUpperCase()).append(str.substring(1)));
  }
}
