import java.util.Scanner;

public class ConsoleProgram {
  Scanner kboard = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Welcome to the proram!");
    boolean finished = false;
    while (!finished) {
      System.out.println("I have a question. Enter your answer: ");
      String answer1 = kboard.nextLine();
      System.out.println("Tell me a number: ");
      int answer2 = kboard.nextInt();
    }
  }
}
