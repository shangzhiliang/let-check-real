package com.szl.letck.cache;

import com.alibaba.fastjson.JSON;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LimitQueue
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/3/25 17:00
 * @Version 1.0
 */
public class LimitQueue<E> implements Queue<E> {

    private int limit;

    private LinkedList<E> queue = null;

    public LimitQueue(int limit){
        this.limit = limit;
        this.queue = new LinkedList<>();
    }

    public Queue<E> getQueue(){
        return this.queue;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return queue.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return queue.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return queue.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return queue.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return queue.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return queue.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return queue.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return queue.retainAll(c);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean equals(Object o) {
        return queue.equals(o);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * @Author szl
     * @Description  入队，同时校验是否超队列长度
     * @Date 2022/3/25 17:10
     * @Param
     * @return
     */
    @Override
    public boolean offer(E e) {

        if(queue !=null && queue.contains(e)){
            queue.remove(e);
        }

        removeLeastVisitElement();

//         queue.addFirst(e);
        return queue.offer(e);
    }


    public void put(E e) {

        if(queue !=null && queue.contains(e)){
            queue.remove(e);
        }

        removeLeastVisitElement();

         queue.addFirst(e);
    }

    private synchronized void removeLeastVisitElement(){
        int size = size();

        if(size > limit -1){
            E o = queue.removeLast();
            System.out.println("本次被剔除的元素：" + JSON.toJSONString(o));
        }
    }

    @Override
    public E remove() {
        return queue.remove();
    }

    /**
     * @Author szl
     * @Description  出队列，最后的元素删除，前边的后移一位
     * @Date 2022/3/25 17:11
     * @Param
     * @return
     */
    @Override
    public E poll() {
        return queue.poll();
    }

    @Override
    public E element() {
        return queue.element();
    }

    @Override
    public E peek() {
        return queue.peek();
    }
}
