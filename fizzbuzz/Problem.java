public class Problem {
  public static void main(String[] args) {
    for (var i = 0; i < 100; i++) {
      if (i == 0) continue;

      if (i % 5 == 0 && i % 3 == 0) {
        System.out.println("FizzBuzz");
        continue;
      }

      if (i % 3 == 0) {
        System.out.println("Fizz");
        continue;
      }

      if (i % 5 == 0) {
        System.out.println("Buzz");
        continue;
      }

      System.out.println(i);
    }
  }
}
