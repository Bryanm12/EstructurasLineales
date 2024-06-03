import Materia.Pilas.Pila;
import Materia.Pilas.PilasGenerica;
import Materia.Models.Pantallas;
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
        pilaPantalla.push(new Pantallas("Settings page", "/Hom/Menu/Settings"));

        System.out.println("Estoy en la pantalla: "+pilaPantalla.peek().getNombre());
        System.out.println("Destruir pantalla: "+pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla: "+pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Pantallas("User page", "/Home/Menu/User"));
        System.out.println("Estoy en la pantalla: "+pilaPantalla.peek().getNombre());

        
    }
}
