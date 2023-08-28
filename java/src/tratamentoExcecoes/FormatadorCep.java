package tratamentoExcecoes;

public class FormatadorCep {
    
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("3840826");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("O cep não corresponde com as regras de negócio.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
