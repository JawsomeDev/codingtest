package ct.week03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열로 큐 만들기
 * 메뉴: 1.add <num>  2.peek  3.poll  4.clear  5.print  0.exit
 */
public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayQueue que = new ArrayQueue(5);

        System.out.println("===========================================");
        System.out.println("1.add 2.peek 3.poll 4.clear 5.print 0.exit");
        System.out.println("===========================================");

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            switch (n) {
                case 1: { // add
                    int m = sc.nextInt();
                    if (m < 0) {
                        System.out.println("음수는 넣을 수 없습니다.");
                        break;
                    }
                    int r = que.add(m);
                    if (r != -1) System.out.println("add: " + r);
                    break;
                }
                case 2: { // peek
                    int r = que.peek();
                    if (r != -1) System.out.println("peek: " + r);
                    break;
                }
                case 3: { // poll
                    int r = que.poll();
                    if (r != -1) System.out.println("poll: " + r);
                    break;
                }
                case 4: { // clear
                    que.clear();
                    System.out.println("cleared");
                    break;
                }
                case 5: { // print
                    que.print();
                    break;
                }
                default:
                    System.out.println("다시 입력하세요!!");
            }
        }
        sc.close();
    }
}

class ArrayQueue {
    private final int[] queue; // 큐 버퍼
    private final int max;     // 최대 용량
    private int cnt;           // 원소 개수
    private int front;         // 맨앞 인덱스
    private int rear;          // 맨뒤 다음 인덱스(삽입 위치)

    public ArrayQueue(int max) {
        this.max = max;
        this.queue = new int[max];
        Arrays.fill(queue, -1);
        this.cnt = 0;
        this.front = 0;
        this.rear = 0;
    }

    // enqueue
    public int add(int n) {
        if (cnt >= max) {
            System.out.println("Queue is full");
            return -1;
        }
        queue[rear] = n;
        rear = (rear + 1) % max;
        cnt++;
        return n;
    }

    // 맨앞 값 보기
    public int peek() {
        if (cnt <= 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // dequeue
    public int poll() {
        if (cnt <= 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int n = queue[front];
        queue[front] = -1;
        front = (front + 1) % max;
        cnt--;
        return n;
    }

    public void clear() {
        Arrays.fill(queue, -1);
        cnt = 0;
        front = 0;
        rear = 0;
    }

    public void print() {
        if (cnt <= 0) {
            System.out.println("Queue is empty");
            return;
        }
        // 논리적 순서대로 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            int idx = (front + i) % max;
            sb.append(queue[idx]);
            if (i < cnt - 1) sb.append(' ');
        }
        System.out.println(sb);
    }
}
