package controleFluxo;

import java.util.Scanner;

public class ResultadoEscolarDois {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Insira a nota(0 a 10): ");
        int nota = sc.nextInt();

        
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
