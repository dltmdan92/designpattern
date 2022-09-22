package me.seungmoo.designpattern.headfirst.ch08.list;

import java.util.AbstractList;

/**
 * subList() 템플릿 메소드에서는 get(), size() 구현 메소드를 필요로 한다.
 *
 */
public class MyStringList extends AbstractList<String> {
    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
    }

    /**
     * subList() 템플릿 메소드가 필요로 하는 get() 메서드 구현
     * @param index index of the element to return
     * @return
     */
    @Override
    public String get(int index) {
        return myList[index];
    }

    /**
     * subList() 템플릿 메소드가 필요로 하는 size() 메서드 구현
     * @return
     */
    @Override
    public int size() {
        return myList.length;
    }

    @Override
    public String set(int index, String element) {
        String oldString = myList[index];
        myList[index] = element;
        return oldString;
    }
}
