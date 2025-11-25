public interface ValueArray<E> {
    void clear();

    boolean contains(E item);

    boolean add(E item);

    E get(int index);

    void insert(E item);

    Object remove(E item);

    boolean isEmpty();

    boolean isFull();

    Object[] split(int index);

    int lowerBound(int low, int high, E item);

    int binarySearch(int low, int high, E item);
}
