import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_and_Hashs {

    public static void main(String[] args){
     Map m = new HashMap(); // it can be an array, a list, integer, etcetera.
        m.put("Ronaldo", 6);
        m.put("Jonathan", "bitch"); // you can point to another string, it doesn't necessarily need to be an integer
        m.put("Cleber", 1);
        m.put("Messiah", 0); // this hashmap doesn't track the order, that's why it's fast.

        System.out.println(m);
        // output : {Ronaldo= 6, Jonathan=bitch, Cleber=1, Messiah=0}


        Map m2 = new TreeMap(); // the treemap sorts by an alphabetic order
        m2.put("a", 18);
        m2.put("foda", 2);
        m2.put("b", 6);

        System.out.println(m2);
        // Output : {a=18,b=6,foda=2}

        Map m3 = new LinkedHashMap(); // it is similar to the list
        m3.put("cleber", 2);
        m3.put("Joe", 0);
        m3.put("Ronald", 1);

        System.out.println(m3);
        // output : {Cleber=2, Joe=0, Ronald=1}

        m3.containsKey(1);
        m3.clear(); // it removes everything from the map

        System.out.println(m3.values()); // output: []

        // do some exercises on this.

    }
}
