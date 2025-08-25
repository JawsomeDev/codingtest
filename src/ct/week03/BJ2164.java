package ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2164 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        while(q.size() > 1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.peek());

    }
}
