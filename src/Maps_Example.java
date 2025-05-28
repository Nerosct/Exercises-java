import java.util.HashMap;
import java.util.*;


public class Maps_Example {
    public static void main(String[] args){
        Map m = new HashMap();
        String str = "Hello My name is Denilson and i'm cool";
        System.out.println(str.toCharArray());

        for (char x:str.toCharArray()){ // iteration
            if (m.containsKey(x)){
               int old = (int) m.get(x);
               m.put(x, old+1);
            }
            else{
                m.put(x,1);
            }
        }
        m.remove(' '); // it removes the blank spaces
        System.out.println(m);
    }
}
