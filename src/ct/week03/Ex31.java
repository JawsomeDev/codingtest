package ct.week03;

import java.util.LinkedList;
import java.util.Queue;

public class Ex31 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("A");
        que.add("B");
        que.offer("C");
        que.offer("D");
        System.out.println(que.toString());
        System.out.println(que.peek());

    }
}
