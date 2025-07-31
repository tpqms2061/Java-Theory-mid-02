package collection.list;

import sun.nio.cs.ext.IBM037;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); //찾는데 o(1) ,데이터 추가 (밀기) (n)

        MyArrayList<Integer> arrayList = new MyArrayList<>();  //조회용 데이터로 사용할것
        addLast(arrayList, size); //찾는데 o(1) ,데이터 추가 (밀기) o(1)

        int loop =10000;
        System.out.println("==MyArrayList 조회");
        getIndex(arrayList,loop,0);
        getIndex(arrayList,loop,size/2); //중간에서 조회
        getIndex(arrayList,loop,size-1); //마지막에서 조회

        System.out.println("==MyArrayList 검색");
        search(arrayList,loop,0);
        search(arrayList,loop,size/2); //중간에서 조회
        search(arrayList,loop,size-1); //마지막에서 조회

        System.out.println("==MyLinkedList 추가");
        addFirst((new MyLinkedList<>()), size);
        addMid((new MyLinkedList<>()), size);  //찾는데  (n) ,데이터 추가 (밀기) o(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); //조회용 데이터로 사용할것
        addLast((linkedList), size); //찾는데  (n) ,데이터 추가 (밀기) o(1)

        System.out.println("==MyLinkedList 조회");
        getIndex(linkedList,loop,0);
        getIndex(linkedList,loop,size/2); //중간에서 조회
        getIndex(linkedList,loop,size-1); //마지막에서 조회

        System.out.println("==MyLinkedList 검색");
        search(linkedList,loop,0);
        search(linkedList,loop,size/2); //중간에서 조회
        search(linkedList,loop,size-1); //마지막에서 조회
    }

    private static void addFirst(MyList<Integer> list, int size) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) +"ms");

    }
//가운데 추가 비교
    private static void addMid(MyList<Integer> list, int size) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i); //대략 중간쯤에 넣을것
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) +"ms");
    }

    //뒤에 추가
    private static void addLast(MyList<Integer> list, int size) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i ); //대략 중간쯤에 넣을것
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) +"ms");
    }
//특정 노드 조회
    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복:" +loop+ ",게산시간:"+ (endTime - startTime) +"ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복:" +loop+ ",게산시간:"+ (endTime - startTime) +"ms");
    }
}
