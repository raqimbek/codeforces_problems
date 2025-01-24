import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var statementNum = Integer.valueOf(scanner.nextLine());
    if (statementNum < 1 || statementNum > 150) return;

    var value = 0;

    while (statementNum > 0) {
      statementNum--;

      var statement = scanner.nextLine();

      System.out.println("Debugging...");
      System.out.print("statement: ");
      System.out.println(statement);
      System.out.print("!statement.equals(\"X++\"): ");
      System.out.println(!statement.equals("X++"));
      System.out.print("!statement.equals(\"++X\"): ");
      System.out.println(!statement.equals("++X"));
      System.out.print("!statement.equals(\"--X\"): ");
      System.out.println(!statement.equals("--X"));
      System.out.print("!statement.equals(\"X--\"): ");
      System.out.println(!statement.equals("X--"));

      if (!statement.equals("X++")
          && !statement.equals("++X")
          && !statement.equals("X--")
          && !statement.equals("--X")
         ) {
           System.out.println("wtf?");
           return;
         }

      switch(statement) {
        case "X++":
        case "++X": value++; break;
        case "X--":
        case "--X": value--; break;
      }
    }

    System.out.println(value);
  }
}
