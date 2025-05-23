public class Comparison {

    public static void main(String[] args){
        String f = "Fuck this shit";
        int x = 10; // declaring an integer variable
        int y = 2;
        int z = 20;
        // > greater than
        // < less than
        // == equal to
        // <= less than and equal to
        // >= greater than and equal to
        // != not equal to
        // = assigning symbol
        // || or operator
        // !(blabla) not operator, it basically changes whatever value stored in the variable or condition
        // if it's true it changes to false and vice versa.
        boolean compare = !(x < z &&  y > z ||  z + 2 < 5 || x + 7 > y); // declaring an empty boolean variable
        // && and operator
        System.out.println(compare);
    }
}
