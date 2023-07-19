import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {
    public static void check_palindrome() {

        System.out.println("enter a string to check for palindrome");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        Stack stack = new Stack();
        System.out.println("stack is" + stack);

        for (int i = 0; i < userInput.length(); i++) {
            stack.push(userInput.charAt(i));

        }

        System.out.println("after adding in stack" + stack);

        String reverseString = "";

        while (!stack.empty()) {
            reverseString =  stack.pop()+reverseString;
        }
        System.out.println(reverseString);

        if (userInput.equals(reverseString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }


    public static void main(String[] args) {
        PalindromStack.check_palindrome();
    }
}

