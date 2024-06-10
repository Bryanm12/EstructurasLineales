package Materia.Ejercicio_02_sorting;
import Materia.Pilas.PilasGenerica;

public class StackSorter {
    public void sortStack(PilasGenerica<Integer> stack){
        PilasGenerica<Integer> stackAdicional = new PilasGenerica<>();
        while (!stackAdicional.isEmpty()) {
            stack.pop();
            while(stackAdicional.peek()>stack.pop()){
                stack.push(stackAdicional.pop());
                }
            stackAdicional.push(stack.pop());
        }
        while(!stackAdicional.isEmpty()){
            stack.push(stackAdicional.pop());
        }
    }
}
