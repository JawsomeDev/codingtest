package ct.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set
 */
public class Ex23 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Mybatis");
        set.add("Oracle");
        set.add("Java");

        for (int i = 0; i < 100; i++) {
            set.add(String.valueOf(i));
        }
        System.out.println(set.toString());

        set.remove("Oracle");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 2

    }
}
