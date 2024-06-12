package Ejercicio_03_LinkedLists;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Node;

public class LinkedListEjr {
    Node posiNode;
    public int getByPos(int position, ListaEnlazada listaAux){
        int size = listaAux.size();
        int targetPos = size-position;
        
        Node current = listaAux.head;
        for(int i=0; i<targetPos;i++){
            current = current.next;
            //if(position!=i){
            //    posiNode=listaAux.head.next;
           // }
        }      
        
        return current.value;
        
    }
}
