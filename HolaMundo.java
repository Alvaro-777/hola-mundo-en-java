/**
*	Muestra por la pantalla la frase "Hola mundo"
*
*	@author Alvaro Colmenero
*/
public class HolaMundo{
	public static void main(){
		String naranja = "\033[33m";
		String azul = "\033[33m";

		System.out.print(naranja +"Hola mundo");
		System.out.print(azul + "Modificacion");
	}
}
