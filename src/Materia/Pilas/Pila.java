package Materia.Pilas;
import java.util.EmptyStackException;

import Materia.Models.Node;


public class Pila {
    private Node top;

    public Pila(){
        top=null;
    }
    /// Push Agregar elemento a la fila
    public void push(int value){
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }
    public int pop(){
        if(top==null){
            System.out.println("La pila esta vacía.");
            throw new EmptyStackException();

        }else{
            int value = top.value;
            top = top.next;
            return value;
        }
        
    }

    public int peek(){
        if(top==null){
            System.out.println("La pila esta vacía.");
            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }

}
