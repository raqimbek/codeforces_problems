import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var tableScheme = Arrays.stream(scanner.nextLine().split(" "))
                      .limit(2)
                      .map(Integer::valueOf)
                      .toList();

    if (tableScheme.size() != 2) return;

    var n = tableScheme.get(0);
    var m = tableScheme.get(1);

    if (n < 2 || m > 100) return;

    List<List<String>> table = new ArrayList<>();
    
    for (var i = 0; i < n; i++) {
      var row = Arrays.stream(scanner.nextLine().split(""))
                      .filter(c -> c.equals("*") || c.equals("."))
                      .limit(m)
                      .toList();


      if (row.size() != m) return;

      table.add(row);
    }

    /*
        first loop:

        1. loop through each row
        2. check if a row contains an asterisk
        3. if a row contains an asterisk, add the row to possibleRows map
        3.1 map's key: index of the row
        3.2. map's value is a list: row itself

        if possibleRowsMap.size() <= 1 return;

        second loop:
        1. loop through possibleRows map values (rows)
        2. if a row contains 2 or more asterisks
        2.0.1. if a row contains more than 2 asterisks, determine the first and the last asterisk
        2.0.2. save the first and last asterisks' indexes
        2.1. check if possibleBottomsOfRectangle map is not empty
        2.1.1. check if it contains a possible bottom with the same asterisk indexes.
        2.1.1.1 if it contains, update that possible bottom row index with the current row index
        2.2 check if possibleTopsOfRectangle map is not empty
        2.2.1. check if the asterisk indexes of the current row match with asterisk indexes of any possibleTopRow
        2.2.1.1 if it matches
        2.2.1.1.1 check if possibleBottomsOfRectangle map contains an entry whose asterisk indexes match with the current row's asterisk indexes.
        2.2.2.1.1.1 if it contains, update that possible bottom row index with the current row index
        2.2.2.1.1.2 continue to the next iteration of the loop
        2.2.2.1.2 add new entry to the possibleBottomsOfRectangle map
        2.2.2.1.2.1 take the first matching possible top as a key
        2.2.2.1.2.2 take the row index as a value
        2.2.1.2 if it doesn't match
        2.2.1.2.1 add the row to possibleTopsOfRectangle map
        2.2.3.2.1.1 add the index of the row
        2.2.3.2.1.2 add the indexes of 2 asterisks
        2.3. continue to the next iteration
        3. (if a row contains only one asterisk) // do not need to write this condition as the opposite conditions is handled above
        3.1. save the index of the asterisk
        3.2. check if the index of the asterisk matches with an asterisk's index of a possible top or bottom
        4. when looping ends, check if possible bottoms map is empty or not.
        4.1 if possible bottoms map is not empty
        4.1.1. determine the most external rectangle

       first map for possible rectangle tops:

       [
         possibleTopRowIndex = [
           asteriskIndexes = List.of(i1, i2),
         ]
       ]

       another map for possible rectangle bottoms:

       [
         possibleTopRowIndex = possibleBottomRowIndex
       ]
    */
  }
}
