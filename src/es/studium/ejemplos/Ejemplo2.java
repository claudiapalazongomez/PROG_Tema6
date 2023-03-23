package es.studium.ejemplos;

public class Ejemplo2
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		int tabla[] = new int[TAM];
		
		for(int i = 0; i<=TAM; i++) {
			try {
				tabla[i] = i*2;
				//Más instrucciones
				//Más todavía
				//Aún más
				//...
			}
			catch(IndexOutOfBoundsException ioobe) { //puedo poner más catch debajo del catch, y si quisiera usar un falso "else" se pone (Exception e)
				// Instrucciones de la excepción
				throw(ioobe); //para que el programa se quite el problema de en medio y se lo carga al so (porque al final el error no desaparece)
			}
			finally { 
				// Instrucciones que siempre se ejecutan tras el try sin error 
				//o tras el try con error y el catch correspondiente
			}
		}
		for(int elemento:tabla) { //sirve para consultar
			System.out.println(elemento);
		}
	}

}
