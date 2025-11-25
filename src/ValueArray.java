public interface ValueArray<E> {
    void clear();

    boolean contains(E item);

    boolean add(E item);

    E get(int index);

    void insert(E item, int index);

    E remove(int index);

    boolean isEmpty();

    boolean isFull();

    Object[] split(int index);

    int lowerBound(E item);

    int binarySearch(E item);
}
