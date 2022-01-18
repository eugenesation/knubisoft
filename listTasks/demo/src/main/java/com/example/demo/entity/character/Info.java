
package com.example.demo.entity.character;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Info {

    private Long count;

    private String next;

    private Long pages;

    private Object prev;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Info{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", pages=" + pages +
                ", prev=" + prev +
                '}';
    }
}
