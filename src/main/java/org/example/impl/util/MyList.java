package org.example.impl.util;

import java.util.*;

public class MyList<T> implements List<Object> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;
    private int pointer = 0;

    public MyList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        if (size > 0)
            elementData = new Object[size];
        else if (size == 0)
            elementData = new Object[0];
        else throw new IllegalArgumentException("Invalid collection capacity " + size);
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public boolean isEmpty() {
        return elementData.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elementData.length - 1; i++) {
            if (elementData[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return elementData[pointer++] != null;
            }

            @Override
            public Object next() {
                return elementData[pointer++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    public Object[] toArray(int firstIndex, int lastIndex) {
        if (firstIndex > lastIndex) {
            throw new RuntimeException("Invalid index: " + firstIndex);
        } else {
            Object[] newArray = new Object[lastIndex - firstIndex];
            System.arraycopy(elementData, firstIndex, newArray, 0, lastIndex - firstIndex);
            return newArray;
        }
    }

    @Override
    public Object[] toArray(Object[] a) {
        if (a.length < size)
            return Arrays.copyOf(elementData, size, a.getClass());
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public boolean add(Object o) {
        Object[] newArr = new Object[elementData.length + 1];
        System.arraycopy(elementData, 0, newArr, 0, elementData.length);
        newArr[elementData.length] = o;
        elementData = newArr;
        return true;
    }

    public void readAll() {
        for (Object obj : elementData) {
            if (obj != null) {
                System.out.println(obj);
            }
        }
    }

    @Override
    public boolean remove(Object obj) {
        if (indexOf(obj) >= 0) {
            remove(indexOf(obj));
            return true;
        } else
            return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        boolean isCheck = false;

        for (int i = 0; i < elementData.length; i++) {
            if (collection != null) {
                if (collection.contains(elementData[i])) {
                    isCheck = true;
                } else {
                    isCheck = false;
                    break;
                }
            }
        }
        return isCheck;
    }

    @Override
    public boolean addAll(Collection<?> collection) {
        if (collection.size() > elementData.length) {
            grow(elementData.length + collection.size());
        }
        System.arraycopy(elementData, 0, collection, 0, elementData.length);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (c.size() != 0) {
            for (int i = 0; i < c.size(); i++) {
                c.remove(i);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean changed = false;
        for (int i = size() - 1; i >= 0; i--) {
            Object obj = get(i);
            if (!c.contains(obj)) {
                remove(i);
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public void clear() {
        elementData = new Object[0];
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public Object set(int index, Object element) {
        for (int i = 0; i < elementData.length - 1; i++) {
            if (elementData[index] != null) {
                elementData[index] = element;
            }
        }
        return new RuntimeException("Invalid index: " + index);
    }

    @Override
    public void add(int index, Object element) {
        elementData[index] = element;
    }

    @Override
    public Object remove(int index) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[index] != null) {
                elementData[index] = null;
            }
        }
        return new RuntimeException("Unexpected value: " + index);
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == o) {
                return i;
            } else return -1;
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = elementData.length - 1; i >= 0; i--) {
            if (elementData[i] == o) {
                return i;
            } else return -1;
        }
        return -1;
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        if (fromIndex != toIndex) {
            List<Object> subList = new ArrayList<>();
            for (int i = fromIndex; i < toIndex; i++) {
                subList.add(elementData[i]);
            }
            return subList;
        }
        return null;
    }

    public void grow(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(elementData, 0, newArray, 0, pointer);
        elementData = newArray;
    }

    @Override
    public ListIterator<Object> listIterator() {
        return new ListIterator<Object>() {
            @Override
            public boolean hasNext() {
                return size < elementData.length;
            }

            @Override
            public Object next() {
                if (hasNext()) {
                    return elementData[pointer++];
                }
                return false;
            }

            @Override
            public boolean hasPrevious() {
                return elementData[pointer--] != null;
            }

            @Override
            public Object previous() {
                return elementData[pointer--];
            }

            @Override
            public int nextIndex() {
                if (pointer++ < elementData.length) {
                    return pointer++;
                }
                return -1;
            }

            @Override
            public int previousIndex() {
                if (pointer-- >= 0) {
                    return pointer--;
                }
                return -1;
            }

            @Override
            public void remove() {
                remove();
            }

            @Override
            public void set(Object o) {
                set(o);
            }

            @Override
            public void add(Object o) {
                add(o);
            }
        };
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        this.pointer = index;
        return new ListIterator<Object>() {
            @Override
            public boolean hasNext() {
                return pointer < getSize();
            }

            @Override
            public Object next() {
                if (pointer < getSize() && pointer >= 0) {
                    return elementData[pointer++];
                }
                return false;
            }

            @Override
            public boolean hasPrevious() {
                if (pointer > 0 && pointer < getSize()) {
                    return true;
                }
                return false;
            }

            @Override
            public Object previous() {
                if (hasPrevious()) {
                    return elementData[pointer--];
                }
                return false;
            }

            @Override
            public int nextIndex() {
                if (hasNext()) {
                    return pointer++;
                }
                return -1;
            }

            @Override
            public int previousIndex() {
                if (hasPrevious()) {
                    return pointer--;
                }
                return -1;
            }

            @Override
            public void remove() {
                remove();
            }

            @Override
            public void set(Object o) {
                set(o);
            }

            @Override
            public void add(Object o) {
                add(o);
            }
        };
    }

    public int getSize() {
        return elementData.length;
    }
}
