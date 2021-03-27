
public class PrototiposDeCurso {
   public static void main(String[] args)
   {
	   ClonacionDeCursos clocurs = new ClonacionDeCursos();
	   Curso curso;
	   Curso cursoClonado;
	   
	   System.out.println("Matematicas"+"\n");
	   
	   curso =new Matematicas();
	   cursoClonado =(Matematicas) clocurs.getClone(curso);
	   System.out.println(curso + "Con ID:" + System.identityHashCode(curso)+"<-------ORIGINAL");
	   System.out.println(cursoClonado + "Con ID:" + System.identityHashCode(cursoClonado)+"<-------CLONADA"+"\n");
	   
	   System.out.println("Sociales" +"\n");
	   
	   curso =new Sociales();
	   cursoClonado =(Sociales) clocurs.getClone(curso);
	   System.out.println(curso + "Con ID:" + System.identityHashCode(curso)+"<-------ORIGINAL");
	   System.out.println(cursoClonado + "Con ID:" + System.identityHashCode(cursoClonado)+"<-------CLONADA"+"\n");
	   
   }
}
