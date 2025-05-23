public class Array {

    public static void main(String[] args){
    // array is a collection of elements at set size
        // how to declare an array in java
        int [] newArr = new int[5]; // you must define how many elements you'll have in that array
        String [] StrArr = new String[100000]; // to declare a string array just change the type of the variable
        double [] dbArr = new double[20]; // example

        // an example of how to access a value inside an Array
        StrArr[0] = "Lucas"; // inputting a text saying hello inside the vector at position zero in the StrArr variable
        StrArr[1] = "Opa"; // inputting a text saying hello inside the vector at position zero in the StrArr variable
        StrArr[2] = "bom dia"; // inputting a text saying hello inside the vector at position zero in the StrArr variable
        StrArr[3] = "boa tarde"; // inputting a text saying hello inside the vector at position zero in the StrArr variable
        StrArr[4] = "boa noite"; // inputting a text saying hello inside the vector at position zero in the StrArr variable
        StrArr[10000] = "Banana";
        String y = StrArr[100]; // Declaring a variable that receives the value of the first vector
        int[] nums = {2,3,54,5,6};

        int x = nums[2];
        System.out.println(x); // printing out the result
        System.out.println(y);

    }
}
