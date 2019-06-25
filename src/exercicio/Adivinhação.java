package exercicio;

import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	Random aleatorio = new Random();
	
	int numeroAleatorio = aleatorio.nextInt(51);
	int sugestao = numeroAleatorio;
	int vidas = 9;
	
	while (vidas > -1) {
		
		System.out.println("digite um numero de 0 a 50 : ");
		numeroAleatorio = entrada.nextInt();
		
		if (numeroAleatorio == sugestao) {
			System.out.println("Parabéns você acertou ! ");
		}else {
			System.out.println("Você errou, restaram "+ vidas-- +" vidas !");
		}if (vidas == -1) {
			System.out.println("GAME OVER , YOU LOSE , ACABOU , JÁ ERA , SE FODEU ! ");
		}
	}	
	}
}