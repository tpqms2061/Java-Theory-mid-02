package deque;

import java.util.ArrayDeque;

public class DequeStackMain {

    public static void main(String[] args) {
        ArrayDeque<Object> deque = new ArrayDeque<>();

        //데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        //다음꺼낼 데이터 확인-단순 조회
        System.out.println("deque.peek() = " + deque.peek());

        //데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
    }
}
