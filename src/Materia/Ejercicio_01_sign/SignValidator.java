package Materia.Ejercicio_01_sign;
import Materia.Pilas.Pila;
public class SignValidator {
    public boolean isValid(String s){
        boolean validar= true;
        Pila pila = new Pila();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'
            || s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'){
                pila.push(i);
            }else if(s.charAt(i)==')'){
                if(pila.peek()=='('){
                    pila.pop();
                    
                }else{
                    return false;
                } 
            }else if(s.charAt(i)==']'){
                if(pila.peek()=='['){
                    pila.pop();
                    
                }else{
                    return false;
                }
            }if(s.charAt(i)=='}'){
                if(pila.peek()=='{'){
                    pila.pop();
                    
                }else{
                    return false;
                } 
            }
        }

        return validar;
    }
    
}
