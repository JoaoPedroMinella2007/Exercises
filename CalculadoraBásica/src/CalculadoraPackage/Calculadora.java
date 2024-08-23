// CALCULADORA UM POUCO MAIS AVANÇADA. ELA MOSTRA ATRAVES DE UM MENU AS OPÇÕES QUE O USUÁRIO DESEJA ESCOLHER E POR MEIO DELAS, EFETUA O 
//CÁLCULO DESEJADO.

package CalculadoraPackage;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
				Scanner input = new Scanner(System.in);		
				
				
				double a = 0, b = 0;
				int opcaoDesejada;
				
		do {
			
				System.out.println("CALCULADORA BÁSICA ");
				System.out.println("\nInforme qual a operação matemática que será utilizada: \n");
				System.out.println("1 - ADIÇÃO \n2 - SUBTRAÇÃO \n3 - MULTIPLICAÇÃO \n4 - DIVISÃO \n5 - SAIR");
				System.out.println("\nOpção desejada?");
				opcaoDesejada = input.nextInt();
				
				switch(opcaoDesejada) {
				
				case 1:
					
					System.out.println("-------------------------------------------------\n");
					System.out.println("==> ADIÇÃO <==\n");
					System.out.print("Primeiro número: ");
					a = input.nextDouble();
					System.out.print("Segundo número: ");
					b = input.nextDouble();
					
				    
					System.out.println("\nResultado: " + adicao(a,b));
					System.out.println("\n--------------------------------------------------");	
					System.out.println("");
					
				break;
				
				case 2:
					
					System.out.println("-------------------------------------------------\n");
					System.out.println("==> SUBTRAÇÃO <==\n");
					System.out.print("Primeiro número: ");
					a = input.nextDouble();
					System.out.print("Segundo número: ");
					b = input.nextDouble();

				    
					System.out.println("\nResultado: " + subtracao(a,b));
					System.out.println("\n--------------------------------------------------");	
					System.out.println("");
						
				break;
				
				case 3: 
					
					System.out.println("-------------------------------------------------\n");
					System.out.println("==> MULTIPLICAÇÃO <==\n");
					System.out.print("Primeiro número: ");
					a = input.nextDouble();
					System.out.print("Segundo número: ");
					b = input.nextDouble();
					
					System.out.println("\nResultado: " + multiplicacao(a,b));
					System.out.println("\n--------------------------------------------------");	
					System.out.println("");
						
				break;
				
				case 4:
					
					System.out.println("-------------------------------------------------\n");
					System.out.println("==> DIVISÃO <==\n");
					System.out.print("Informe o primeiro número: ");
					a = input.nextDouble();
					System.out.print("Informe o segundo número: ");
					b = input.nextDouble();
					
	
					System.out.println("\nO resultado da divisão é: " + divisao(a,b));
					System.out.println("\n--------------------------------------------------");	
					System.out.println("");
								
				break;
				
				case 5:
					
				System.out.println("\nCalculadora encerrada.");
				
				break;
				
				default: 
					
					System.out.println("\nERRO! Talvez você escolheu uma opção inexistente no menu de opções. Tente novamente.\n");
				
				
				}
				
		}while(opcaoDesejada != 5);
				
		input.close();

			}

			private static double adicao(double a, double b) {
				
				return a + b;
				
			}

			private static double subtracao(double a, double b) {
				
				return a - b;
				
			}

			private static double multiplicacao(double a, double b) {
				
				return a * b;
				
			}

			private static double divisao(double a, double b) {
				
				return a / b;
				
			}
			
	}

