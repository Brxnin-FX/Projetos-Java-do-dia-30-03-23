package arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int[] array;
		int tamanhoArray,media;

		Scanner entrada = new Scanner(System.in);
		
		
		         //Setando o tamanho do Array//
		  System.out.printf("Informe o tamanho do Array: ");
			tamanhoArray = entrada.nextInt();
			array = new int[tamanhoArray];
			
			
			//Setando os vaolores do array//
		for(int indice = 0; indice < tamanhoArray; indice++) {
				System.out.printf("Informe a  posição[%d]: ",indice);
				array[indice] = entrada.nextInt();
			}

		
		int total=0;
		
		
		for(int i=0; i<array.length; i++) {
			
			System.out.printf("%s%9s\n",i,array[i]);
			total=total+array[i];
			
		}
		
		
		
		System.out.printf("A quantidade de elementos do aray eh: %d\n",tamanhoArray);
		System.out.printf("Total de elementos do arrays: %d\n",total);
		

		entrada.close();
	}

}
