package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>(); //13초걸림
        MyLinkedList<Integer> list = new MyLinkedList<>(); //0,9초 걸림

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1000_000);

    }

}
