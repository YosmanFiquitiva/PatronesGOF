package memento.examples.statemachine;

public class Memento {
	
    private final String stateCalification; 

    public Memento(String calificationToSave) { 
        stateCalification = calificationToSave; 
    } 

    public String getSavedcalification() { 
        return stateCalification; 
    }
}
