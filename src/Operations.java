public class Operations {
    public static void main(String[] args){
        int x = 2; // declaring a variable and type casting integer on it
        double y = 56; /* if one of the operators is a double everything becomes double
        */
        double power = Math.pow(x,y);

        double u = y * (double)x; // type casting

        System.out.println(power);
        System.out.println(u);
    }
}
