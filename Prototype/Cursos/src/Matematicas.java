
public class Matematicas implements Curso {
	@Override
    public Curso clone() {
        Curso mateClonar = null;
        
        
        try {mateClonar=(Matematicas) super.clone();}
        catch(CloneNotSupportedException mate){mate.printStackTrace();}
        return mateClonar;
        
       }
	public String toString() {return "Esta Curso es matematicas";}
	}
