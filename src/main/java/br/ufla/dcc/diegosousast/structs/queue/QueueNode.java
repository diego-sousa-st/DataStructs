package br.ufla.dcc.diegosousast.structs.queue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class QueueNode<T> {

    private T element;
    private QueueNode<T> pointerToNextElement;

}
