public class For{
    //estrutura do controle de fluxo for
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}



// Outras estruturas

//estrutura 1
for(int carneirinhosV1 = 1 ; carneirinhosV1 <=20; carneirinhosV1 ++) {
    System.out.println(carneirinhosV1 + " - Carneirinho(s)");
}

//estrutura 2
//o que importa é somente o bloco condicional
int carneirinhosV2 = 1;
for( ; carneirinhosV2 <=20; ) {
    System.out.println(carneirinhosV2 + " - Carneirinho(s)");
    carneirinhosV2 ++;
}

//for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }

    }
}
