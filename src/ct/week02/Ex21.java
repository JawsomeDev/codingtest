package ct.week02;

import java.util.ArrayList;
import java.util.List;

public class Ex21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Spring");
        list.add("Hibernate");
        list.add("Hibernate");
        System.out.println(list.toString());
        list.add(2, "Oracle");
        list.set(3, "Mybatis");
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
        list.clear();
    }
}
