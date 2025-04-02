import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);
    String input;

    System.out.println("wpisz tekst: ");

    while (true) {
      input = skan.nextLine();
      if (input.equals("q")) {
        break;
      }
      System.out.println(input);
    }

    System.out.println("");
    skan.close();
  }
}
