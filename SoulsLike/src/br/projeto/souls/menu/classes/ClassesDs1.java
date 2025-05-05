package br.projeto.souls.menu.classes;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class ClassesDs1 {
    private final List<ClassePersonagem> classes = Arrays.asList(
        new ClassePersonagem("Guerreiro", 4, 11, 9, 12, 13, 13, 11, 9, 9),
        new ClassePersonagem("Cavaleiro", 5, 14, 10, 10, 11, 11, 10, 9, 11),
        new ClassePersonagem("Viajante", 3, 10, 11, 10, 10, 14, 12, 11, 8),
        new ClassePersonagem("Ladrão", 4, 9, 11, 9, 9, 15, 10, 12, 11),
        new ClassePersonagem("Bandido", 4, 12, 8, 14, 14, 9, 11, 8, 10),
        new ClassePersonagem("Caçador", 4, 9, 9, 11, 12, 14, 11, 10, 9),
        new ClassePersonagem("Feiticeiro", 3, 8, 15, 8, 9, 11, 8, 15, 8),
        new ClassePersonagem("Piromante", 1, 10, 12, 11, 12, 9, 12, 10, 8),
        new ClassePersonagem("Clérigo", 2, 11, 11, 9, 12, 8, 11, 8, 14),
        new ClassePersonagem("Indigente", 6, 11, 11, 11, 11, 11, 11, 11, 11)
    );

    public ClassesDs1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = sc.nextLine();

        ClassePersonagem classeSelecionada = exibirMenuDeSelecao(sc);

        if (classeSelecionada != null) {
            System.out.println("\n" + nomePersonagem + " Classe: " + classeSelecionada.nome);
            
        } else {
            System.out.println("Nenhuma classe foi selecionada.");
        }
    }

    private ClassePersonagem exibirMenuDeSelecao(Scanner sc) {
        while (true) {
            System.out.println("\nSelecione sua classe:");
            for (int i = 0; i < classes.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, classes.get(i).nome);
            }
            System.out.println("0. Cancelar");

            System.out.print("Escolha: ");
            int escolha = lerNumero(sc);

            if (escolha == 0) {
                return null;
            }

            if (escolha > 0 && escolha <= classes.size()) {
                ClassePersonagem classe = classes.get(escolha - 1);
                classe.exibirStatus();

                if (confirmarEscolha(sc)) {
                    return classe;
                } else {
                    System.out.println("Voltando ao menu de seleção...");
                }
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private boolean confirmarEscolha(Scanner sc) {
        while (true) {
            System.out.print("Deseja prosseguir com esta classe? (Y/N): ");
            String confirmar = sc.next().trim().toUpperCase();
            if (confirmar.equals("Y")) {
                return true;
            } else if (confirmar.equals("N")) {
                return false;
            } else {
                System.out.println("Entrada inválida. Digite Y ou N.");
            }
        }
    }

    private int lerNumero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
