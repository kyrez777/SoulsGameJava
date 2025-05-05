package br.projeto.souls.menu;

import java.util.Scanner;

import br.projeto.souls.menu.classes.ClassesDs1;

public class SelecionarJogo {
    public static void selecionarJogo() {

        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            try {
                System.out.println("Selecione o jogo");
                System.out.println("1. Dark Souls 1");
                System.out.println("2. Dark Souls 2");
                System.out.println("3. Dark Souls 3");
                System.out.println("4. Elden Ring");
                System.out.println("5. Sekiro");
                System.out.println("6. Sair");
                System.out.print(": ");
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        new ClassesDs1();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;    
                    case 6:
                        System.out.println("Obrigador por usar o programa!");
                        System.exit(0);
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
        } while (opc != 6);
    }

}
