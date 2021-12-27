package org.example.impl;

import org.example.impl.util.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyListTest {

    @Test
    @DisplayName("Checking for default size after initialization.")
    void testShouldCheckTheSizeOfList() {
        MyList<Integer> myList = new MyList<>();
        Assertions.assertEquals(10, myList.size());
    }

    @Test
    @DisplayName("Checking an isEmpty method. Test should pass.")
    void testShouldCheckListEmptyOrNot() {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        Assertions.assertFalse(myList.isEmpty());
    }

    @Test
    void testShouldCheckListForContainingRequireElement() {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        Assertions.assertTrue(myList.contains(1));
    }

    @Test
    void testShouldCheckListForAddingNewElements() {
        MyList<Integer> myList = new MyList<>();
        myList.add(5);
        Assertions.assertEquals(5, myList.get(10));
    }

    @Test
    void testShouldCheckMethodForDeletingElement() {
        MyList<Integer> myList = new MyList<>();
        myList.add(5);
        myList.remove(10);
        Assertions.assertEquals(null, myList.get(10));
    }

    @Test
    void testShouldCheckListClearing() {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.clear();
        Assertions.assertTrue(myList.isEmpty());
    }

    @Test
    void testShouldCheckAdding() {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        Assertions.assertEquals(1, myList.get(10));
    }

    @Test
    void testShouldCheckRightWorkUpdate() {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.set(10, 4);
        Assertions.assertEquals(4, myList.get(10));
    }

}