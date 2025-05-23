import java.util.Scanner;

public class For_continuation {

    public static void main(String[] args){
        int[] arr = {1,5,7,6,8,9};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++){
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
            break;
        }

        for (String n: names ){
            System.out.println(n);
            if (n.equals("Tim")){
                break;
            }
        }

    }
}
