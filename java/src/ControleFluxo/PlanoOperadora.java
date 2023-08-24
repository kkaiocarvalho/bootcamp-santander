package controleFluxo;

import java.util.Scanner;

// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		//String plano = "M"; // M / T

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho(T - M - B): ");
        
        char plano = sc.next().charAt(0);
        plano = Character.toUpperCase(plano);
        //String asString = Character.toString(plano);

		switch (plano) {
			case 'T': {
				System.out.println("5Gb Youtube");
			}
			case 'M': {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case 'B': {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}



/*// Modo condicional convencional
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}*/

