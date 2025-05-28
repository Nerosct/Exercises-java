import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int[] x = {99,6,3,4,7,5,1,22};

        Arrays.sort(x, 1, 7);

        for(int i:x)
        {
            System.out.print(i + ", "); // sorting
        }



    }
}
