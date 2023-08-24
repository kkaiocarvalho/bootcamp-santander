package controleFluxo;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a nota(0 a 10): ");
        int nota = sc.nextInt();

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}