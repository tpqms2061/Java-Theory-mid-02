package deque;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueMain {

    public static void main(String[] args) {
        ArrayDeque<Object> queue = new ArrayDeque<>();
//        LinkedList<Object> queue = new LinkedList<>();
    //데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println("queue = " + queue);


        //다음 꺼낼 데이터 확인 - 단순 조회만
        System.out.println("queue.peek() = " + queue.peek());

        //데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }

}
