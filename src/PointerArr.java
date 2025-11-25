public interface PointerArr<E> {
    void clear();

    boolean add(E item);

    E get(int index);

    void insert(E item);

    E remove(E item);
}
