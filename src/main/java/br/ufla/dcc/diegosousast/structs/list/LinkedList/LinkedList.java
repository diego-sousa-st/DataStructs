package br.ufla.dcc.diegosousast.structs.list.LinkedList;

import br.ufla.dcc.diegosousast.structs.list.ListNode;
import br.ufla.dcc.diegosousast.structs.list.SearchableElement;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LinkedList<T extends SearchableElement> {

    private Integer size;
    private ListNode<T> head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }
    
    public boolean isEmpty() {
        return this.head != null;
    }

    
    public boolean contains(T element) {
        return false;
    }
    
    public T[] toArray() {
        return null;
    }

    public void add(T element) {

    }


    public void add(int index, T element) {

    }
    
    public boolean remove(T element) {
        return false;
    }

    public boolean remove(String key) {
        return false;
    }

    public T remove(int index) {
        return null;
    }

    public void clear() {
        this.size = 0;
        this.head = null;
    }

    public T get(int index) {
        ListNode<T> actualNode = this.head;
        for (int i = 0; i < index; i++) {
            actualNode = actualNode.getPointerToNextElement();
            if(actualNode == null) return null;
        }
        return actualNode.getElement();
    }

    public T get(String key) {
        ListNode<T> actualNode = this.head;
        Boolean canSearch = true;
        while(!actualNode.getElement().getKey().equals(key) && canSearch) {
            actualNode = actualNode.getPointerToNextElement();
            if(actualNode == null) {
                canSearch = false;
            }
        }
        return canSearch ? actualNode.getElement() : null;
    }

    public T set(int index, T element) {
        return null;
    }
    
    public int indexOf(T element) {
        return 0;
    }

    public int lastIndexOf(T element) {
        return 0;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

}
