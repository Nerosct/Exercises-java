public class Loops{

    public static void main(String[] args) {

        // for loops are the fundamental aspect of every language
        int[] arr = {1, 2, 5, 3, 4, 5, 6};

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == 2) {
                    System.out.println("Found a two at index " + i);
                }
                if (arr[i] == 5) {
                    System.out.println("Found a 5 at index " + i);
                }
                if (arr[i] == 4) {
                    System.out.println("Theres a 4 at index " + i);
                }
            }
    }
}