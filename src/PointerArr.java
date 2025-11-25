public interface PointerArr<E> {
    void clear();

    boolean add(E item);

    E get(int index);

    void insert(E item, int index);

    E remove(int index);

    Object[] split(int index);
}
