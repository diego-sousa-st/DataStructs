package br.ufla.dcc.diegosousast.structs.stack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class StackNode<T> {

    private T element;
    private StackNode<T> pointerToNextElement;

}
