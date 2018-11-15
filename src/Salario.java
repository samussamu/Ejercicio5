import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre ="";
		int horas=0;
		double pagoPorHora = 0.0;
		double pagoTotal = 0.0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println ("¿como te llamas?");
		nombre = teclado.nextLine();
		System.out.println("¿Cuantas horas trabjaste esta semana?");
		horas = teclado.nextInt();
		System.out.println("¿cuanto te pagan por hora?);");
		pagoPorHora = teclado.nextDouble();
		pagoTotal = horas * pagoPorHora;
		System.out.println("hola"+nombre);
		System.out.println("tu sueldo es"+pagoTotal+" $");
	}

}
