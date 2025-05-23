import java.util.Scanner; // import of the scanner class

public class Example {

    public static void main(String[] args){
        System.out.print("Input your age"); // class System
        Scanner sc = new Scanner(System.in); // declaring an scanner class
        String s = sc.nextLine(); //
        int age = Integer.parseInt(s);

        if (age >= 13){
            System.out.println("You are a little bitch");

        }
        else {
            System.out.println("you cannot ride");
        }
    }
}
