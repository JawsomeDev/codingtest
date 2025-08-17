package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex25 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("홍길동", 70);
        map.put("이몽룡", 100);

        System.out.println(map.size());
        System.out.println(map.get("홍길동"));
        System.out.println(map.get("홍길도"));
        System.out.println(map.getOrDefault("홍길도", 0));

        Set<String> keySet = map.keySet();
        for(String s : keySet) {
            System.out.printf("%s = %d\n", s, map.get(s));
        }
    }
}
