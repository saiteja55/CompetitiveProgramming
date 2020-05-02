package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Saiteja on 2019-07-06
 */
public class CheckIfStringPalindrome {
  public static void main(String[] args) {
    CheckIfStringPalindrome ctx = new CheckIfStringPalindrome();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String inputString = scanner.nextLine();
    inputString = cleanTheInput(inputString.toLowerCase());
    if (ctx.checkIfPalindrome(inputString)) {
      System.out.println("It is a Palindrome");
    } else {
      System.out.println("Its not a Palindrome");
    }
  }

  private static String cleanTheInput(String inputString) {
    String cleaned = "";
    for (int i = 0; i < inputString.length(); i++) {
      if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z') {
        cleaned += String.valueOf(inputString.charAt(i));
      }
    }
    return cleaned;
  }

  private boolean checkIfPalindrome(String inputString) {
    if (inputString == null || inputString.equals("")) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < inputString.length(); i++) {
      stack.push(inputString.charAt(i));
    }
    String newString = "";
    while (stack.size() > 0) { // we can use stack.isEmpty() as well
      newString += String.valueOf(stack.pop());
    }
    return inputString.equalsIgnoreCase(newString);
  }
}
