import java.util.Scanner;

public class Condition {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

          // if you want to compare two strings use .equals, it works better than two equals "=="

        if (s.equals("Tim")) // if condition with opening and ending braces
        {
            System.out.println("I didn't know that intellij could see typos :O"); // class that outputs messages to user
        }
        else if (s.equals("Burning disgrace")){
            System.out.println("my little pussy");
        }
        else { // else should be the last thing in an if statement
            System.out.println("Case sensitive error");
        }

    }
}
