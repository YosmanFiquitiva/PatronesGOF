package memento.examples.statemachine;

public class Life {
	private String stateCalification; 
	   
    public void set(String time) { 
        System.out.println("setting calification to " + stateCalification); 
        this.stateCalification = stateCalification; 
    } 
   
    public Memento saveToMemento() { 
        System.out.println("Saving calification to Memento"); 
        return new Memento(stateCalification); 
    } 
   
    public void restoreFromMemento(Memento memento) { 
        stateCalification = memento.getSavedcalification(); 
        System.out.println("calification restored from Memento: " + stateCalification); 
    }
}
