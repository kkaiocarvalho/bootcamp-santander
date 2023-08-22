package Metodos;

import java.util.Scanner;

public class SmartTv {
    boolean ligada;
    int canal = 1;
    int volume = 25;


    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void statusTV(){
        System.out.println("\n| TV ligada? " + ligada + " | Canal: " + canal + " | Volume atual: " + volume);
    }




    void desejaLigarDesligar(){
    Scanner sc = new Scanner(System.in);
        System.out.print("\nQuer desligar ou  ligar? Digite 1 para ligar e 0 para desligar: ");
        int desejaLigarDesligar = sc.nextInt();
        if(desejaLigarDesligar == 1){
            ligar();
        }
        if(desejaLigarDesligar == 0){
            desligar();
        }

        System.out.println("\nTV ligada? " + ligada);
    }




    void proximoCanal(){
        canal++;
        System.out.println("\nCanal: " + canal);
    }
    void voltarCanal(){
        canal--;
        System.out.println("\nCanal: " + canal);
    }




    void aumentarVolume(){
        volume++;
        System.out.println("\nVolume: " + volume);
    }
    void diminuirVolume(){
        volume--;
        System.out.println("\nVolume: " + volume);
    }




    void mudarCanal(){
        Scanner scCanal = new Scanner(System.in);
        System.out.print("\nDigite o numero do canal desejado: ");
        int numeroCanal = scCanal.nextInt();

        canal = numeroCanal;

        System.out.println("\nCanal: " + numeroCanal);
    }

}
