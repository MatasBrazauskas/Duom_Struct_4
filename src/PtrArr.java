import java.util.Arrays;

public class PtrArr<E> implements PointerArr<E> {
    private Object[] arr;
    private int size;

    public PtrArr(int size){
        arr = new Object[size];
    }

    public void clear(){
        Arrays.fill(arr, null);
    }

    public boolean add(E item){
        if(size <= arr.length){
            return false;
        }
        arr[size] = item;
        return true;
    }

    public E get(int index){
        return (E)arr[index];
    }

    public void insert(E item, int index){
        System.arraycopy(arr, index, arr, index + 1, size - index - 1);

        arr[index] = item;
        size++;
    }

    public E remove(int index){
        E removedItem = (E)arr[index];

        System.arraycopy(arr, index + 1, arr, index, size - index - 1);

        arr[size--] = null;
        return removedItem;
    }
}
