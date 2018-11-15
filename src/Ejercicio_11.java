import java.util.Scanner;
public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numero1= 0;
	int numero2=0;
	int numero3=0;
	int multiplicacion=0;
	
	Scanner teclado= new Scanner(System.in);
	System.out.println("Primer numero: ");
	numero1=teclado.nextInt();
	System.out.println("Segundo numero: ");
	numero2=teclado.nextInt();
	System.out.println("Tercer numero: ");
	numero3=teclado.nextInt();
	multiplicacion =(numero1*numero2*numero3);
	System.out.println("El resultado es "+multiplicacion+".");
	teclado.close();
			
	
	}

}
