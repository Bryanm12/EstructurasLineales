package Materia.Pilas;
import java.util.EmptyStackException;

import Materia.Models.NodeGenerico;
public class PilasGenerica<T> {
    private NodeGenerico<T> top;

    public PilasGenerica(){
        top = null;
    }
    public void push(T dato){
        NodeGenerico<T> nuevoNodo = new NodeGenerico<T>(dato);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }
    public boolean isEmpty(){
        return top == null;
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("La pila está vacía.");
            throw new EmptyStackException();
        }
            T data = top.data;
            top = top.next;
            return data;
        
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("La pila está vacía.");
            throw new EmptyStackException();
        }
        return top.data;
    }
}

