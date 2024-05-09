package prog2project;

import java.util.*;

public class Prog2project {

    public static void mostrarMenu() {
        System.out.println("CROSSWORD --- PALAVRAS-CRUZADAS");
        System.out.println("1-Jogar");
        System.out.println("2-Escolher Nivel");
        System.out.println("3-Criar Usuario");
        System.out.println("4-Jogos guardados");
        System.out.println("5-Hall of Fame(Maiores Pontuações)");
        System.out.println("0-Sair");
        System.out.print("---->");

    }

    public static void mostrarGrelha(String[][] grelha, int tamanho_x, int tamanho_y) {
        for (int i = 0; i < tamanho_x; i++) {
            for (int j = 0; j < tamanho_y; j++) {
                System.out.print(" " + grelha[i][j] + " ");

            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }

    public static void preencherGrelha(String[][] grelha, int tamanho_x, int tamanho_y) {
        for (int i = 0; i < tamanho_x; i++) {
            for (int j = 0; j < tamanho_x; j++) {
                if (!grelha[i][j].equals("#")) {
                    grelha[i][j] = i + "" + j;

                }

            }

        }
    }

    public static void main(String[] args) {

        int op = 1;
        Scanner input = new Scanner(System.in);

        do {
            mostrarMenu();
            op = input.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Jogando....");
                    
                    do {
                        System.out.println("Escolher nível:");
                        System.out.println("1-Primeiro Nivel");
                        System.out.println("2-Primeiro Nivel");
                        System.out.println("3-Terceiro Nivel");
                        System.out.println("0-Voltar ao menu inicial");

                        int op2 = input.nextInt();

                        switch (op2) {
                            case 1:
                                int tamanho_x = 10;
                                int  tamanho_y = 10;
                                int  total_pontos = 0;

                                String[][] grelha = {
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", ".", ".", ".", ".", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", ".", ".", ".", ".", ".", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}

                                };

                                //preenchendo a matriz
                                preencherGrelha(grelha, tamanho_x, tamanho_y);
                                // mostrar a gelha
                                System.out.println("Os espaços representados por um número, ex 12 em que 1 representa a posição X da matriz e 2 Y");
                                System.out.println("São espaços que devem ser preenchidos com uma letra, ex: A,B,C....");
                                System.out.println("Última dica, as palavras em falta nesse nível são nomes de frutas!");

                                mostrarGrelha(grelha, tamanho_x, tamanho_y);
                                System.out.print("\n");
                                System.out.print("\n");

                                System.out.print("Posição X: ");
                                int posicao_x = input.nextInt();
                                int posicao_y = input.nextInt();

                                break;

                            default:
                                throw new AssertionError();
                        }
                    } while (op2 != 0);
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 0);
    }

}
