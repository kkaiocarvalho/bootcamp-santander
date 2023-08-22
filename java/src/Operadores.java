public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois)); // equals serve para comparar

        System.out.println("");//QUEBRA DE LINHA

        int num1 = 1;
        int num2 = 2;

        if(num1 == num2){
            System.out.println("a condição é verdadeira");
        
        }else{
            System.out.println("a condição é falsa");
        }
        
        boolean simNao = num1 == num2;
        System.out.println("A condição é igual? "+ simNao);

        simNao = num1 != num2;
        System.out.println("A condição é diferente? " + simNao);

        
        System.out.println("");//QUEBRA DE LINHA

        boolean condição1 = true;
        boolean condição2 = false;
        if( condição1 && condição2){
            System.out.println("As duas são true");
        }
        if( condição1 || condição2){
            System.out.println("São diferentes");
        }


    }
}
