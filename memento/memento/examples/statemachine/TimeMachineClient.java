package memento.examples.statemachine;

import java.util.ArrayList;
import java.util.List;

public class TimeMachineClient {
	
	public static void main(String[] args) { 
          
        List<Memento> savedCalifications = new ArrayList<Memento>(); 
   
        Life life = new Life(); 
   
        // previous states of the califications
        life.set("No entregado"); 
        savedCalifications.add(life.saveToMemento()); 
        life.set("Enviado para calificar"); 
        savedCalifications.add(life.saveToMemento()); 
        life.set("Enviado y calificado"); 
   
        life.restoreFromMemento(savedCalifications.get(0));    
    }
}
