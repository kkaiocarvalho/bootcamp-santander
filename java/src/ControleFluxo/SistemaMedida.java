package ControleFluxo;

import java.util.Scanner;

// Modo condicional switch / case
public class SistemaMedida {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho(P - M - G): ");
        
        char sigla = sc.next().charAt(0);
        sigla = Character.toUpperCase(sigla);
        

		switch (sigla) {
		case 'P':{
			System.out.println("PEQUENO");
			break;
		}
		case 'M':{
			System.out.println("MÉDIO");
			break;
		}
		case 'G':{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
    
}




/*// Modo condicional if/else
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}*/
