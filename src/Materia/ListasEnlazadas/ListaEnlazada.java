package Materia.ListasEnlazadas;
import Materia.Models.Node;
public class ListaEnlazada {
    public Node head;
    public int size;
    public ListaEnlazada(){

    }
    //Agregar Nodos a la lista
    public void addNode(int value){
        if(head==null){
            head=new Node(value);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
            size ++;
        }

        current.next = new Node(value);

    }

    ///Metodo para eliminar
    public void deleteNode(int value){
        if(head == null) return; //No hay elementos no hagas nada

        if(head.value== value){
            head = head.next;
            size --;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }


    }

    public void print(){
        if(head==null){
            System.out.println("Lista vacia");
            return;
        }

        Node current = head;
        while (current.next!= null){
            System.out.println("Node -> "+current.value);
            current = current.next;
        }
        System.out.println("Node -> "+current.value);
        System.out.println("Fin de la lista.");

    }
    public int size(){
        return size;
    }

}
