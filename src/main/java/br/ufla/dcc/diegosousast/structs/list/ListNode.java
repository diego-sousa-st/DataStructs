package br.ufla.dcc.diegosousast.structs.list;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListNode<T extends SearchableElement> {

    private T element;
    private ListNode<T> pointerToNextElement;
    private ListNode<T> pointerToPrevElement;

}
