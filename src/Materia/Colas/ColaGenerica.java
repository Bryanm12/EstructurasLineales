package Materia.Colas;
import java.util.NoSuchElementException;
import Materia.Models.NodeGenerico;
public class ColaGenerica <T>{
    private NodeGenerico<T> first;
    private NodeGenerico<T> last;
    private int size;

    public ColaGenerica(){
        this.first=null;
        this.last=null;
    }
    public void addNode(T data){
        NodeGenerico<T> nuevoNodo = new NodeGenerico<>(data);
        if(isEmpty()){
            first=nuevoNodo;
            last=nuevoNodo;
        }else{
            last.next=nuevoNodo;
            last=nuevoNodo;
        }
        size ++;
    }
    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola está vacía.");
        }
        T value = first.data;
        first= first.next;

        if(first==null){
            last=null;
        }
        size --;
        return value;
    }
    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola está vacía.");
        }
        return first.data;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return size;
    }
}
