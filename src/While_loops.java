import java.util.Scanner;

public class While_loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a while loop is basically equal to a for loop, the only difference is that you don't know when to stop


        int x;
        int count = 0;
        do {
            System.out.println("Type a Number: ");
            x = sc.nextInt();
            count++;
            if(x != 10) {
                System.out.println("Print 10, dumbass");
            }
        } while (x != 10);
        System.out.println("You printed the wrong number " + count + " Times, dumb bitch.");
    }
}
