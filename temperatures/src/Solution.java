import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {


  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); // the number of temperatures to analyse
    if (in.hasNextLine()) {
      in.nextLine();
    }


    String result = "";
    String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

    String[] temperatures = temps.split(" ");

    List<Integer> tempArray = new ArrayList<>();
    List<Integer> finalArray = new ArrayList<>();

    for (int i = 0; i< n;i++) {
      tempArray.add(Integer.parseInt(temperatures[i]));
    }

    Collections.sort(tempArray);
    for (int j = 0;j < n; j++){
      int absChecker = Math.abs(tempArray.get(j));
      finalArray.add(Math.abs(tempArray.get(j)));
      Collections.sort(finalArray);
      if (finalArray.get(0) == 0) {
        result += 0;
      } else if (absChecker == finalArray.get(0)){
        result = Integer.toString(tempArray.get(j));
      }
    }

    if (n == 0) { result = "0";}

    // Write an action using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println(result);
  }
}