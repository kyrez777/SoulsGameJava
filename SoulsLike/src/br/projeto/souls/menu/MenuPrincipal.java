package br.projeto.souls.menu;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelecionarJogo sJogo = new SelecionarJogo();
        int opc; 

        do {
            try {
                System.out.println("SoulsGames");
                System.out.println("1. Selecionar Jogo");
                System.out.println("2. Sair");
                System.out.print(": ");
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        sJogo.selecionarJogo();
                        break;
                    case 2:
                        System.out.println("Obrigador por usar o programa!");
                        break;
                
                    default:
                        System.out.println("Selecione uma opção válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                sc.nextLine();
                opc = 0;   
            }
        } while (opc != 2);
    }

    
}
