package MyList;

import java.util.Arrays;

public class MyList<T> {
    T[] list;
    int index=0;
    public MyList() {
        this.list = (T[]) new Object[10];

    }

    public MyList(int capacity) {
        this.list = (T[]) new Object[capacity];

    }

    public void add(T adding) {
        if (this.index == this.list.length) {
            list = Arrays.copyOf(this.list, this.list.length * 2);
        }
        this.list[this.index] = adding;
        index++;
    }




    public int getSize() {
        return this.list.length;
    }

    public int getCapacity() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                return i;
            }

        }
        return 0;
    }

    public void get(int index) {
        System.out.println(this.list[index]);
    }

    public T remove(int index) {
        T removedElement = this.list[index];
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
        this.list[this.list.length - 1] = null;
        return removedElement;
    }

    public T set(int index, T element) {
        if (index > this.list.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        T oldElement = this.list[index];
        this.list[index] = element;
        return oldElement;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.list.length; i++) {
            sb.append(this.list[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(T data) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] != null) {
                if (this.list[i].equals(data)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[this.list.length];
        System.arraycopy(this.list, 0, array, 0, this.list.length);
        return array;
    }

    public void clear() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }

    public MyList<Object> subList(int start,int finish){
        MyList<Object> sublist = new MyList<>((finish-start )+1);
        for(int i = start ; i <=finish ; i++){
            sublist.add(list[i]);
        }
        return sublist;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i].equals(data)) {
                return true;
            }
        }
        return false;
    }
}







