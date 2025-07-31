package collection.list;

public interface MyList<E> {
//공통적인 부분 제네릭으로 생성
    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
