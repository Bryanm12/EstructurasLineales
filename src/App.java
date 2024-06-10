import Materia.Pilas.Pila;
import Materia.Pilas.PilasGenerica;
import Materia.Models.Pantallas;
import Materia.Colas.Cola;
import Materia.Colas.ColaGenerica;
import Materia.Ejercicio_01_sign.SignValidator;
import Materia.Ejercicio_02_sorting.StackSorter;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en la cima de la fila es: "+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la cima de la fila es: "+pila.peek());

        System.out.println();
    ///Implementación pila genérica
        PilasGenerica<Pantallas> pilaPantalla= new PilasGenerica<>();

        pilaPantalla.push(new Pantallas("Home page", "/Home"));
        pilaPantalla.push(new Pantallas("Menu page", "/Home/Menu"));
        pilaPantalla.push(new Pantallas("Settings page", "/Home/Menu/Settings"));

        System.out.println("Estoy en la pantalla: "+pilaPantalla.peek().getNombre());
        System.out.println("Destruir pantalla: "+pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla: "+pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Pantallas("User page", "/Home/Menu/User"));
        System.out.println("Estoy en la pantalla: "+pilaPantalla.peek().getNombre());

        //Implementación de Cola

        Cola queue = new Cola();
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        System.out.println("Elemento en el frente: "+queue.peek());

        System.out.println("Elemento retirado: "+queue.remove());
        System.out.println("Elemento en el frente: "+queue.peek());

        System.out.println("Elemento retirado: "+queue.remove());
        System.out.println("Elemento en el frente: "+queue.peek());

        System.out.println("¿Cola vacía?: "+(queue.isEmpty() ? "Si" : "No"));

        
        ColaGenerica<Pantallas> queueGeneric = new ColaGenerica<>();

        queueGeneric.addNode(new Pantallas("Home page", "/Home"));
        queueGeneric.addNode(new Pantallas("Menu page", "/Home/Menu"));
        queueGeneric.addNode(new Pantallas("Settings page", "/Home/Menu/Settings"));
        System.out.println("El tamaño de la cola es: "+queueGeneric.size());
        System.out.println("Estoy en la pantalla \t"+ queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida \t"+queueGeneric.remove().getNombre());
        queueGeneric.addNode(new Pantallas("User page", "/Home/Menu/User"));
        System.out.println("Estoy en la pantalla \t"+ queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida \t"+queueGeneric.remove().getNombre());
        System.out.println("Pantalla destruida \t"+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla \t"+ queueGeneric.peek().getNombre());
        System.out.println("El tamaño de la cola es: "+queueGeneric.size());

        SignValidator validar = new SignValidator();
        System.out.println(validar.isValid("([])"));

        PilasGenerica<Integer> numeros =  new PilasGenerica<>();
        numeros.push(2);
        numeros.push(9);
        numeros.push(11);
        numeros.push(3);
        numeros.push(5);
        System.out.println("Los numeros son: "+numeros);
        //while(!numeros.isEmpty()){
        //   System.out.print(numeros.pop()+"->");
            
        //}
        //System.out.println();

        StackSorter ordenado = new StackSorter();
        ordenado.sortStack(numeros);
        System.out.println("Los números ordenados son:" );
        while(!numeros.isEmpty()){
            System.out.print(numeros.pop()+"->");
        }
        System.out.println();
    }
}
