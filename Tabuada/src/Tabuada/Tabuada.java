package Tabuada;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número para a tabuada: ");
		int numeroTabuada = input.nextInt();
		
		System.out.print("Informe também, até que número você deseja que a tabuada do "+numeroTabuada+" vá: ");
		int numeroTabuadaVai = input.nextInt();
		
		System.out.println();
		
		System.out.println("Aqui está a tabuada do "+numeroTabuada+", de 0 até "+numeroTabuadaVai+":");
		
		System.out.println();
		
		for (int i = 0; i <= numeroTabuadaVai; i++) {
			
			int tabuadaResultado = numeroTabuada * i;
			
			System.out.println(numeroTabuada + " X " + i + " = " + tabuadaResultado);
		
		}
		

		input.close();	
	}

}
