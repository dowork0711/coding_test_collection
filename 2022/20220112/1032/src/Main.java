import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String[] fileNames = new String [n];

    for (int i = 0; i < fileNames.length; i++) {
      fileNames[i] = sc.next();
    }

    sc.close();

    String res = "";

    for (int i = 0; i < fileNames[i].length(); i++) {
      char let = fileNames[i].charAt(i);
      System.out.println(let);
    }

    System.out.println(Arrays.toString(fileNames));

  }
}