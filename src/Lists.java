import java.util.*;

public class Lists {
// Lists
    public static void main(String[] args){
        Set<Integer> t = new HashSet<Integer >(); // hashset
        t.add(5); // if you have two values that are exactly the same, the hashset will ignore it
        t.add(5); // adds elements of the class integer
        t.add(6);
        t.add(7);
        t.add(8);
        t.add(9);
        t.remove(9); // removes the element  10
        int y = t.size();
        // a hashset doesn't have any order pre-established, it is a bubble, we just know that things exist
        // sets are way more fast than arrays
        boolean x = t.contains(9);
        System.out.println(y);
        System.out.println(x);
        System.out.println(t);
        t.add(10);
        Set<Integer> w = new HashSet<Integer>(t);

        System.out.println(w);
        Set<Integer> p = new TreeSet<Integer>(); // the tree set gives you an order of elements
        p.add(-1);
        p.add(0);
        p.add(1);
        p.add(2);
        p.add(3);
        System.out.println(p);

        // ArrayList
        ArrayList<Integer> l = new ArrayList<Integer>(); //  dynamically sized array, it's slow and can be added many things onto it
        l.add(10);
        l.add(20);
        l.add(15);
        l.add(85); // adding values to the arraylist
        l.add(35); // adding a value to the third position of the array
        l.set(2, 30); // set a value to a pre-established index (it has to exist before)
        l.subList(1, 5);
        int s = l.size();
        int getting = l.get(2); // gets the position zero of the array
        System.out.println(getting);
        System.out.println(s);
        System.out.println(l.subList(1,5)); // gets the elements of the array not including the last one in this case is 5,
        // so it goes from 1 to 5

        // Linked List
        LinkedList<Integer> Link = new LinkedList<Integer>();




    }
}
