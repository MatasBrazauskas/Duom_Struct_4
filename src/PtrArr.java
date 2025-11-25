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

    public void insert(E item){

    }

    public E remove(E item){
        return null;
    }
}
