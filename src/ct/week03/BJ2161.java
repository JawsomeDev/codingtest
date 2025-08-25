package ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2161 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        for(int i=1;i<=n;i++) {
            que.add(i);
        }
        while(que.size() > 1){
            // 버리기
            System.out.printf("%d", que.poll());;
            // 빼서 추가
            que.add(que.poll());
        }
        System.out.println(que.peek());
    }
}
