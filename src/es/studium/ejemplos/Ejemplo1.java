package es.studium.ejemplos;

public class Ejemplo1
{

	public static void main(String[] args)
	{
		int a, b;
		a = 7;
		b = 0;
		try {
		System.out.println(a/b);
		System.out.println("Tarea finalizada con éxito");
		}
		catch(ArithmeticException ae) { //se pueden poner más de 1 excepción gracias al |
			System.out.println("Error:"+ae.getMessage());
		}
	}

}
