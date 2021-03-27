
public class Sociales implements Curso{
	@Override
	public Curso clone() {
        Curso socialesClonar = null;
        
        
        try {socialesClonar=(Sociales) super.clone();}
        catch(CloneNotSupportedException sociales){sociales.printStackTrace();}
        return socialesClonar;
        
       }
	public String toString(){ return "Esta Curso es sociales";}
}
